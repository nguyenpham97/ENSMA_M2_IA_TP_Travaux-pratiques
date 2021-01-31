package fr.ensma.a3.ia.mymultichat.common;

import fr.ensma.a3.ia.mymultichat.api.canal.ChatCanalDesc;
import fr.ensma.a3.ia.mymultichat.api.entities.SocketAction;
import fr.ensma.a3.ia.mymultichat.client.MultiChatClientEndPoint;
import fr.ensma.a3.ia.mymultichat.api.entities.User;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;
import javax.websocket.Session;
import org.apache.http.client.utils.URIBuilder;
import org.glassfish.tyrus.client.ClientManager;

/**
 *
 * @author lammi
 */
public class ApiManager {

    public static ApiManager INSTANCE = new ApiManager();
    private ClientManager client;
    private final Client restclient = ClientBuilder.newClient();

    private ApiManager() {
        REST_URI = "http://localhost:8080/services/multichat/";
        client = ClientManager.createClient();
    }
    private final String REST_URI;

    private String getSocketServer(int chanelId, SocketAction socketAction) {
        return String.format("%s/%d/%s", "ws://localhost:8080/ws/multichat", chanelId, socketAction.getAction());
    }

    private Invocation.Builder getApiServer(String... paths) {
        WebTarget target = restclient.target(REST_URI);
        for (String path : paths) {
            target = target.path(path);
        }
        return target.request(MediaType.APPLICATION_JSON);
    }

    public ChatCanalDesc getChanel(int id) {
        ChatCanalDesc resp = restclient.target(REST_URI).path(id + "").request(MediaType.APPLICATION_JSON).get(ChatCanalDesc.class);
        return resp;
    }

    public Optional<Session> createSocketConnect(int chanelId, User user) {
        try {

            URIBuilder urib = new URIBuilder(getSocketServer(chanelId, SocketAction.NEW_USER));
            urib.addParameter("userId", user.getUserId());
            urib.addParameter("username", user.getName());

            Session session = client.connectToServer(MultiChatClientEndPoint.class, urib.build());
            return Optional.of(session);
        } catch (Exception e) {
        }
        return Optional.empty();
    }

    public List<ChatCanalDesc> getAllChanel() {
        List<ChatCanalDesc> resp = getApiServer("allchanel").get(GenericTypeRet.LIST_CHAT_CHANEL);
        return resp;
    }

    public ChatCanalDesc createChanel(int chanelid, int maxplayer) {
        String[] strParam = {"createchanel", chanelid + "", maxplayer + ""};
        ChatCanalDesc resp = getApiServer(strParam).get(GenericTypeRet.CHAT_CHANEL);
        return resp;
    }

    public static void main(String[] args) {
        SocketAction valueOf = SocketAction.findValue("newuser");
        System.out.println("valueOf = " + valueOf);
    }
}