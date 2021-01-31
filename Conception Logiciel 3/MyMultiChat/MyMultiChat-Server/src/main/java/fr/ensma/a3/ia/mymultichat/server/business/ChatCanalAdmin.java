package fr.ensma.a3.ia.mymultichat.server.business;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.mymultichat.api.canal.ChatCanalDesc;
import fr.ensma.a3.ia.mymultichat.server.websocket.ChanelData;
import fr.ensma.a3.ia.mymultichat.server.websocket.ConnectSocketObject;
import fr.ensma.a3.ia.mymultichat.server.websocket.MultiChatServerEndPoint;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.RandomUtils;

public class ChatCanalAdmin {

    public static ChatCanalAdmin INSTANCE = new ChatCanalAdmin();
    List<ChatCanalDesc> chatCanalDescs = new ArrayList<>();

    private ChatCanalAdmin() {
        ChatCanalDesc privcanal = new ChatCanalDesc(1, "Canal de chat privé ... ");
        ChatCanalDesc profcanal = new ChatCanalDesc(2, "Canal de chat pro ...");
        ChatCanalDesc amicanal = new ChatCanalDesc(3, "Canal de chat amis ...");
        chatCanalDescs.add(privcanal);
        chatCanalDescs.add(profcanal);
        chatCanalDescs.add(amicanal);

    }

    public List<ChatCanalDesc> getAllCanal() {
        for (ChatCanalDesc chatCanalDesc : chatCanalDescs) {
            chatCanalDesc.setCurrentNumPlayer(getCurrentNumPlayer(chatCanalDesc.getCanalId()));
        }
        return chatCanalDescs;
    }

    public Optional<ChatCanalDesc> getChanel(int chanelId) {
        for (ChatCanalDesc chatCanalDesc : chatCanalDescs) {
            if (chatCanalDesc.getCanalId() == chanelId) {
                return Optional.of(chatCanalDesc);
            }
        }
        return Optional.empty();
    }

    public int getCurrentNumPlayer(int chanelId) {
        ChanelData chanelData = MultiChatServerEndPoint.CHANELID_USERID_OBJECT.get(chanelId);
        if (chanelData != null) {
            Map<String, ConnectSocketObject> userIdConnectSocketObject = chanelData.getUserIdConnectSocketObject();
            if (userIdConnectSocketObject != null) {
                return userIdConnectSocketObject.size();
            }
        }
        return 0;
    }

    public ChatCanalDesc addNewCanal(int canalId, int maxplayer) {
        List<ChatCanalDesc> collect = chatCanalDescs.stream().filter((t) -> {
            return t.getCanalId() == canalId;
        }).collect(Collectors.toList());
        if (collect.isEmpty()) {
            ChatCanalDesc chatCanalDesc = new ChatCanalDesc(canalId, "TEST" + RandomUtils.nextInt(0, 1000), 1, maxplayer);
            chatCanalDescs.add(chatCanalDesc);
            return chatCanalDesc;
        } else {
            return null;
        }
    }
}