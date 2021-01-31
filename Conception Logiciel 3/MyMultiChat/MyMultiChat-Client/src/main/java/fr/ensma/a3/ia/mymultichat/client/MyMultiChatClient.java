package fr.ensma.a3.ia.mymultichat.client;

import javax.websocket.Session;
import com.google.gson.Gson;
import fr.ensma.a3.ia.mymultichat.api.entities.SocketParam;
import fr.ensma.a3.ia.mymultichat.api.entities.User;

import fr.ensma.a3.ia.mymultichat.api.message.ClientMessage;
import static fr.ensma.a3.ia.mymultichat.client.MultiChatClientEndPoint.CLIENT;
import fr.ensma.a3.ia.mymultichat.common.ApiManager;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.RandomUtils;

public class MyMultiChatClient {

    public static void main(String[] args) throws Exception {
//        CLIENT = new Client(1, RandomUtils.nextInt(0, 100) + "");
        Optional<Client> clOptional = Client.createClient();
        CLIENT = clOptional.get();
        try {
            Optional<Session> opSess = ApiManager.INSTANCE.createSocketConnect(CLIENT.getRegistedChanelId(), CLIENT.getUser());
            if (!opSess.isPresent()) {
                throw new Exception("Not Connect Socket!!!");
            }
            Session sess = opSess.get();
            CLIENT.setSession(sess);

            String pseudo = "";
            sess.getUserProperties().put("Pseudo", pseudo);
            String blabla = "";
            do {
//                blabla = scan.nextLine();
//                sess.getBasicRemote().sendText(formatMessage(pseudo, blabla));
            } while (!blabla.equalsIgnoreCase("quit"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            scan.close();
        }
    }

}