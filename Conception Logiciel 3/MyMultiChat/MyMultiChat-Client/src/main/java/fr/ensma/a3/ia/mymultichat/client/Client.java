package fr.ensma.a3.ia.mymultichat.client;

import fr.ensma.a3.ia.mymultichat.api.canal.ChatCanalDesc;
import fr.ensma.a3.ia.mymultichat.common.ApiManager;
import fr.ensma.a3.ia.mymultichat.api.entities.User;
import fr.ensma.a3.ia.mymultichat.common.IOAction;
import java.util.List;
import java.util.Optional;
import javax.websocket.Session;

public class Client {

    private int registedChanelId;
    private User user;
    private Session session;

    public static Optional<Client> createClient() {
        try {

            Client client = new Client();
            client.selectChanel();
            client.createUser();
            return Optional.of(client);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    private Client() {

    }

    public void setSession(Session session) {
        this.session = session;
    }

    public static Optional<Client> createClient(int chanelId, String userId) {
        try {

            Client client = new Client();
            ChatCanalDesc chanel = ApiManager.INSTANCE.getChanel(chanelId);
            if (chanel != null) {
                client.registedChanelId = chanel.getCanalId();
            } else {
                throw new Exception("Not Found ChanelID");
            }
            client.user = new User(userId);
            return Optional.of(client);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public Client(int chanelId, String userId) throws Exception {
        ChatCanalDesc chanel = ApiManager.INSTANCE.getChanel(chanelId);
        user = new User(userId, userId);
        if (chanel != null) {
            registedChanelId = chanel.getCanalId();
        } else {
            throw new Exception("Not Found Chanel");
        }

    }

    private ChatCanalDesc selectChanel() {
        List<ChatCanalDesc> allChanel = ApiManager.INSTANCE.getAllChanel();
        allChanel.forEach(canalDesc -> {
            System.err.println(String.format("ID:%d- NAME:%s (%d user in chanel)",
                    canalDesc.getCanalId(), canalDesc.getCanalName(), canalDesc.getCurrentNumPlayer()));
        });
        ChatCanalDesc selectedChatCanalDesc;
        while (true) {
            try {
                String chanelIdStr = IOAction.readIO("Select Chanel, Input number chanel ID:");
                int chanelId = Integer.parseInt(chanelIdStr);
                Optional<ChatCanalDesc> opChatCanalDesc
                        = allChanel.stream().filter((t) -> {
                            return t.getCanalId() == chanelId;
                        }).findAny();
                if (opChatCanalDesc.isPresent()) {
                    selectedChatCanalDesc = opChatCanalDesc.get();
                    break;
                } else {
                    String maxPlayerStr = IOAction.readIO("Input number max player:");
                    int maxPlayer = Integer.parseInt(maxPlayerStr);
                    ChatCanalDesc createChanel = ApiManager.INSTANCE.createChanel(chanelId, maxPlayer);
                    if (createChanel != null) {
                        selectedChatCanalDesc = createChanel;
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Chanel ID is a Number");
            }

        }
        this.registedChanelId = selectedChatCanalDesc.getCanalId();
        return selectedChatCanalDesc;

    }

    private User createUser() {
        String userId = IOAction.readIO("Input UserId");
        String username = IOAction.readIO("Input UserName (Optional, default username = userid)");
        if (username.isEmpty()) {
            user = new User(userId);
        } else {
            user = new User(userId, username);
        }
        return user;
    }

    public int getRegistedChanelId() {
        return registedChanelId;
    }

    public User getUser() {
        return user;
    }

}