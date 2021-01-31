
package fr.ensma.a3.ia.mymultichat.common;

import fr.ensma.a3.ia.mymultichat.api.canal.ChatCanalDesc;
import jakarta.ws.rs.core.GenericType;
import java.util.List;

public class GenericTypeRet {

    public static GenericType<List<ChatCanalDesc>> LIST_CHAT_CHANEL = new GenericType<List<ChatCanalDesc>>() {
    };
    public static GenericType<ChatCanalDesc> CHAT_CHANEL = new GenericType<ChatCanalDesc>() {
    };
}