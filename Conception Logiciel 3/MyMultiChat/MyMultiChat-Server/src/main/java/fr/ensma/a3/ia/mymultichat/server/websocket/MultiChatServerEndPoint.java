package fr.ensma.a3.ia.mymultichat.server.websocket;

import com.google.gson.Gson;
import fr.ensma.a3.ia.mymultichat.api.canal.ChatCanalDesc;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import fr.ensma.a3.ia.mymultichat.api.message.ClientMessage;
import fr.ensma.a3.ia.mymultichat.api.messageutil.ClientMessageDecoder;
import fr.ensma.a3.ia.mymultichat.api.messageutil.ClientMessageEncoder;
import fr.ensma.a3.ia.mymultichat.api.entities.SocketAction;
import fr.ensma.a3.ia.mymultichat.api.entities.SocketParam;
import fr.ensma.a3.ia.mymultichat.api.entities.TurnGame;
import fr.ensma.a3.ia.mymultichat.api.entities.User;
import fr.ensma.a3.ia.mymultichat.api.message.DisconectAlertMessage;
import fr.ensma.a3.ia.mymultichat.api.message.ErrorConnectMessage;
import fr.ensma.a3.ia.mymultichat.api.message.PredictGameMessage;
import fr.ensma.a3.ia.mymultichat.api.message.ReadyToStartGameMessage;
import fr.ensma.a3.ia.mymultichat.api.message.ResultPredictMessage;
import fr.ensma.a3.ia.mymultichat.api.message.TurnGameMessage;
import fr.ensma.a3.ia.mymultichat.api.message.WelComeMessage;
import fr.ensma.a3.ia.mymultichat.server.business.ChatCanalAdmin;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint(value = "/ws/multichat/{chanelId}/{socketAction}", encoders = ClientMessageEncoder.class, decoders = ClientMessageDecoder.class)
public class MultiChatServerEndPoint extends BaseSocket {

    static Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());
    public static Map<Integer, ChanelData> CHANELID_USERID_OBJECT = new ConcurrentHashMap<>();
    Gson gson = new Gson();

    @OnOpen
    public void onOpen(@PathParam("socketAction") String socketAction, @PathParam("chanelId") Integer chanelId,
            Session sess, EndpointConfig endpointConfig) {
        try {

            SocketAction action = SocketAction.findValue(socketAction);
            String userId = getParam(sess, "userId");
            String username = getParam(sess, "username");

            if (action == SocketAction.NEW_USER) {
                ChanelData chanelData = CHANELID_USERID_OBJECT.get(chanelId);

                User user = new User(userId, username);

                if (chanelData == null) {
                    chanelData = new ChanelData(chanelId, new ConcurrentHashMap<>());
                    chanelData.addConnectSocketObject(userId, new ConnectSocketObject(user, sess));
                    CHANELID_USERID_OBJECT.put(chanelId, chanelData);
                } else {
                    if (chanelData.getStatusChanel() == ChanelData.StatusChanel.STARTED) {
                        ClientMessage message = new ErrorConnectMessage(chanelId, ErrorConnectMessage.ERROR_CONNECT.ROOM_PLAYING);
                        sendMessageToUser(sess, message);
                        return;
                    }
                    ConnectSocketObject connectSocketObject = chanelData.getConnectSocketObject(userId);
                    if (connectSocketObject == null) {
                        chanelData.addConnectSocketObject(userId, new ConnectSocketObject(user, sess));
                    }
                }
                List<User> userRet = new ArrayList<>();
                Map<String, ConnectSocketObject> userIdConnectSocketObject
                        = CHANELID_USERID_OBJECT.get(chanelId).getUserIdConnectSocketObject();
                for (Map.Entry<String, ConnectSocketObject> entry : userIdConnectSocketObject.entrySet()) {
                    ConnectSocketObject connectSocketObject = entry.getValue();
                    userRet.add(connectSocketObject.getUser());
                }
                sess.getUserProperties().put(SocketParam.USERS_IN_ROOM, userRet);
                WelComeMessage message = new WelComeMessage(chanelId, user);
                broadcast(message);
                checkAndStartGame(chanelId);
                logRoomStat(chanelId);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnMessage
    public void onMessage(ClientMessage mess, Session sess) {
        try {

            if (mess instanceof PredictGameMessage) {
                PredictGameMessage message = (PredictGameMessage) mess;
                ChanelData chanelData = CHANELID_USERID_OBJECT.get(message.getChanelId());
                ClientMessage clientMessage;

                if (chanelData.getStatusChanel() == ChanelData.StatusChanel.STARTED) {
                    TurnGame turnGame = chanelData.getTurnGame();
                    if (turnGame.getTurnUser().getUserId().equals(message.getUserIdOfPredict())) {
                        if (message.getPredictValue() == turnGame.getVictortyValue()) {
                            clientMessage = new ResultPredictMessage(mess.getChanelId(), turnGame.getTurnUser(), message.getPredictValue(),
                                    ResultPredictMessage.ERROR_PREDICT.SUCCESS);
                            broadcast(clientMessage);
                            chanelData.setStatusChanel(ChanelData.StatusChanel.WAIT_TO_START);

                        } else {
                            if (message.getPredictValue() > turnGame.getVictortyValue()) {
                                clientMessage = new ResultPredictMessage(mess.getChanelId(), turnGame.getTurnUser(), message.getPredictValue(),
                                        ResultPredictMessage.ERROR_PREDICT.TOO_BIG);
                            } else {
                                clientMessage = new ResultPredictMessage(mess.getChanelId(), turnGame.getTurnUser(), message.getPredictValue(),
                                        ResultPredictMessage.ERROR_PREDICT.TOO_SMALL);
                            }
                            broadcast(clientMessage);
                            broadcastNewTurn(chanelData.getChanelID());
                        }
                    }

                } else {//WRONG_TURN
                    clientMessage = new ResultPredictMessage(mess.getChanelId(),
                            ResultPredictMessage.ERROR_PREDICT.WRONG_TURN);
                    sendMessageToUser(sess, clientMessage);
                }
            } else if (mess instanceof ReadyToStartGameMessage) {
                ReadyToStartGameMessage message = (ReadyToStartGameMessage) mess;
                checkAndStartGame(message.getChanelId());
            } else {
                ClientMessage clientMessage = new ResultPredictMessage(mess.getChanelId(),
                        ResultPredictMessage.ERROR_PREDICT.WAITING_START_GAME);
                sendMessageToUser(sess, clientMessage);
            }
            logRoomStat(mess.getChanelId());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnClose
    public void onClose(@PathParam("chanelId") Integer chanelId, Session sess) {
        try {

            ChanelData chanelData = CHANELID_USERID_OBJECT.get(chanelId);
            User disconectedUser = null;
            for (Map.Entry<String, ConnectSocketObject> entry : chanelData.getUserIdConnectSocketObject().entrySet()) {
                String userId = entry.getKey();
                ConnectSocketObject connectSocketObj = entry.getValue();

                if (connectSocketObj.getSession().getId().equals(sess.getId())) {
                    if (chanelData.getUserIdConnectSocketObject().size() == 1) {
                        CHANELID_USERID_OBJECT.remove(chanelId);
                    } else {
                        chanelData.getUserIdConnectSocketObject().remove(userId);
                        disconectedUser = connectSocketObj.getUser();
                        System.err.println("Disconect User " + userId);
                    }
                    break;
                }
            }
            if (disconectedUser
                    != null) {
                ClientMessage message = new DisconectAlertMessage(chanelId, disconectedUser);
                broadcast(message);

                TurnGame currentTurnGame = chanelData.getTurnGame();
                boolean isTurnGameOfdisconectedUser = currentTurnGame.getTurnUser().getUserId().equals(disconectedUser.getUserId());
                if (isTurnGameOfdisconectedUser) {
                    Map<String, ConnectSocketObject> userIdConnectSocketObject = chanelData.getUserIdConnectSocketObject();
                    ArrayList<String> userIds = new ArrayList<>(userIdConnectSocketObject.keySet());
                    Collections.sort(userIds);

                    User turnUser = userIdConnectSocketObject
                            .get(userIds.get((currentTurnGame.getTurnNumber() - 1) % userIds.size())).getUser();
                    currentTurnGame.setTurnUser(turnUser);
                    TurnGameMessage turnGameMessage = new TurnGameMessage(chanelId, currentTurnGame);
                    broadcast(turnGameMessage);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        logRoomStat(chanelId);

    }

    @OnError
    public void onError(Session session, Throwable t) {
        t.printStackTrace();
    }

    private static void broadcast(ClientMessage message) {
        try {
            ChanelData chanelData = CHANELID_USERID_OBJECT.get(message.getChanelId());
            if (chanelData != null) {
                for (Map.Entry<String, ConnectSocketObject> entry : chanelData.getUserIdConnectSocketObject().entrySet()) {
                    ConnectSocketObject connectSocketObject = entry.getValue();
                    connectSocketObject.getSession().getBasicRemote().sendObject(message);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sendMessageToUser(Session session, ClientMessage message) {
        try {
            session.getBasicRemote().sendObject(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ClientMessage test(ClientMessage message) {
        return message;
    }

    public static void main(String[] args) {
        ClientMessage message = new WelComeMessage(1, new User("1"));
        WelComeMessage test = (WelComeMessage) test(message);
        System.out.println("test = " + test);
    }

    private void checkAndStartGame(Integer chanelId) {
        ChanelData chanelData = CHANELID_USERID_OBJECT.get(chanelId);
        Map<String, ConnectSocketObject> userId_ConnectSocketObject = chanelData.getUserIdConnectSocketObject();
        Optional<ChatCanalDesc> opChatCanalDesc = ChatCanalAdmin.INSTANCE.getChanel(chanelId);
        if (opChatCanalDesc.isPresent()) {
            ChatCanalDesc chatCanalDesc = opChatCanalDesc.get();
            if (userId_ConnectSocketObject.size() >= chatCanalDesc.getMaxPlayer()) {
                broadcastNewTurn(chanelId);
            }
        }

    }

    public void broadcastNewTurn(int chanelId) {
        ChanelData chanelData = CHANELID_USERID_OBJECT.get(chanelId);
        Map<String, ConnectSocketObject> userId_ConnectSocketObject = chanelData.getUserIdConnectSocketObject();
        ArrayList<String> userIds = new ArrayList<>(userId_ConnectSocketObject.keySet());
        TurnGame currentTurnGame = chanelData.getTurnGame();
        Collections.sort(userIds);
        if (chanelData.getStatusChanel() != ChanelData.StatusChanel.STARTED) {//play again
            chanelData.setStatusChanel(ChanelData.StatusChanel.STARTED);
        }
        if (currentTurnGame == null) {
            chanelData.setStatusChanel(ChanelData.StatusChanel.STARTED);
            currentTurnGame = new TurnGame(null, 0);
        }
        int turn = currentTurnGame.getTurnNumber() + 1;

        User turnUser = userId_ConnectSocketObject
                .get(userIds.get((turn - 1) % userIds.size())).getUser();
        currentTurnGame.setTurnNumber(turn);
        currentTurnGame.setTurnUser(turnUser);
        chanelData.setTurnGame(currentTurnGame);
        TurnGameMessage message = new TurnGameMessage(chanelId, currentTurnGame);
        broadcast(message);
    }

    public void logRoomStat(int chanelId) {
        ChanelData chanelData = CHANELID_USERID_OBJECT.get(chanelId);

        System.out.println(String.format("Room %s, status %s, members [%s], turnGame: %s",
                chanelId,
                chanelData.getStatusChanel(),
                gson.toJson(chanelData.getUserIdConnectSocketObject().keySet()),
                chanelData.getTurnGame() != null ? gson.toJson(chanelData.getTurnGame()) : "_"));

    }
}