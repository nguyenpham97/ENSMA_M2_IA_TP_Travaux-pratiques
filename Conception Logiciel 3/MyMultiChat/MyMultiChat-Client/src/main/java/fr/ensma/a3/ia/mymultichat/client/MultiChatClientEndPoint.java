package fr.ensma.a3.ia.mymultichat.client;

import com.google.gson.Gson;
import fr.ensma.a3.ia.mymultichat.api.entities.TurnGame;
import javax.websocket.ClientEndpoint;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import fr.ensma.a3.ia.mymultichat.api.message.ClientMessage;
import fr.ensma.a3.ia.mymultichat.api.message.ErrorConnectMessage;
import fr.ensma.a3.ia.mymultichat.api.messageutil.ClientMessageDecoder;
import fr.ensma.a3.ia.mymultichat.api.messageutil.ClientMessageEncoder;
import fr.ensma.a3.ia.mymultichat.api.message.PredictGameMessage;
import fr.ensma.a3.ia.mymultichat.api.message.ResultPredictMessage;
import fr.ensma.a3.ia.mymultichat.api.message.TurnGameMessage;
import fr.ensma.a3.ia.mymultichat.api.message.WelComeMessage;
import fr.ensma.a3.ia.mymultichat.common.IOAction;

@ClientEndpoint(encoders = ClientMessageEncoder.class, decoders = ClientMessageDecoder.class)
public class MultiChatClientEndPoint {

    public static Client CLIENT;

    public static boolean isItMe(String userId) {
        return userId.equals(CLIENT.getUser().getUserId());

    }

    @OnOpen
    public void onOpen(Session sess) {
        System.out.println("Connect esteshlish !!");
    }
    Gson gson = new Gson();

    @OnMessage
    public void onMessage(ClientMessage mess, Session session) {
//        if (mess.getTypeMessage() == ClientMessage.TypeMessage.WELCOME) {
//        System.out.println(gson.toJson(mess));
        if (mess instanceof WelComeMessage) {
            WelComeMessage message = (WelComeMessage) mess;
            if (isItMe(message.getUser().getUserId())) {
                IOAction.printIO(String.format("ID of You: %s ,Join room '%s' success",
                        message.getUser().getUserId(), CLIENT.getRegistedChanelId()));
            } else {
                IOAction.printIO(String.format("Wellcome new player 'ID:%s' 'NAME:%s' ",
                        message.getUser().getUserId(), message.getUser().getName()));
            }

        } else if (mess instanceof ErrorConnectMessage) {
            ErrorConnectMessage message = (ErrorConnectMessage) mess;
            if (message.getError_connect() == ErrorConnectMessage.ERROR_CONNECT.ROOM_PLAYING) {
                IOAction.printIO(String.format("Romm %s busy (game started). Please come back late!",
                        message.getChanelId()));
            }
        } else if (mess instanceof TurnGameMessage) {
            TurnGameMessage message = (TurnGameMessage) mess;

            if (isItMe(message.getTurnUser().getUserId())) {
                predictNumber(message, session);
            } else {
                IOAction.printIO(String.format("Waiting ... turn predict of 'ID:%s' 'NAME:%s' ",
                        message.getTurnUser().getUserId(), message.getTurnUser().getName()));
            }

        } else if (mess instanceof ResultPredictMessage) {
            ResultPredictMessage message = (ResultPredictMessage) mess;
            switch (message.getError_predict()) {
                case SUCCESS:
                    if (isItMe(message.getTurnUser().getUserId())) {
                        IOAction.printIO("YOU ARE WINNER ");
                    } else {
                        IOAction.printIO(String.format("The Winner is 'ID:%s' 'NAME:%s' ",
                                message.getTurnUser().getUserId(), message.getTurnUser().getName()));
                    }
                    break;
                case TOO_BIG:
                case TOO_SMALL:
                    if (isItMe(message.getTurnUser().getUserId())) {
                        IOAction.printIO("You predict number " + message.getError_predict());
                    } else {
                        IOAction.printIO(String.format("USer'ID:%s' 'NAME:%s' predict %d --> %s",
                                message.getTurnUser().getUserId(), message.getTurnUser().getName(),
                                message.getPredictValue(), message.getError_predict()));
                    }
                    break;
                case WRONG_TURN:
                    IOAction.printIO("It's not your turn yet");
                    break;
                case WAITING_START_GAME:
                    IOAction.printIO("The game has not yet started");
                    break;
                default:
                    IOAction.printIO("Something wrong");
                    break;
            }
        }

    }

    @OnError
    public void processError(Throwable t) {
        t.printStackTrace();
    }

    public void predictNumber(TurnGameMessage message, Session session) {
        int predictedNumber = 0;
        while (true) {
            try {
                String predictedNumberStr = IOAction.readIO(String.format("Enter the number you predicted (between 0-%d):",
                        TurnGame.MAX_VICTORY_VALUE));
                predictedNumber = Integer.parseInt(predictedNumberStr);
                if (predictedNumber < 0 || predictedNumber > 100) {
                    IOAction.printIO(String.format("Number you predicted must between 0-%d", TurnGame.MAX_VICTORY_VALUE));
                } else {
                    break;
                }
            } catch (Exception e) {
                IOAction.printIO("Number you predicted must a number");
            }
        }
        ClientMessage clientMessage = new PredictGameMessage(predictedNumber, CLIENT.getUser().getUserId(),
                message.getTurnNumber(), CLIENT.getRegistedChanelId());
        try {
            session.getBasicRemote().sendObject(clientMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}