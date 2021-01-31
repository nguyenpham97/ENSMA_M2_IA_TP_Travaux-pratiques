package fr.ensma.a3.ia.mymultichat.server.websocket;

import java.util.ArrayList;
import java.util.List;
import javax.websocket.Session;

/**
 *
 * @author lammi
 */
public class BaseSocket {

    /**
     * *
     *
     * @param session
     * @param key
     * @return return empty string if not found
     */
    public String getParam(Session session, String key) {
        List<String> strs = session.getRequestParameterMap().get(key);
        return strs == null ? "" : strs.get(0);
    }
    
    /**
     * *
     *
     * @param session
     * @param key
     * @return return empty List if not found
     */
    public List<String> getParamOfListValue(Session session, String key) {
        List<String> strs = session.getRequestParameterMap().get(key);
        return strs == null ? new ArrayList<>() : strs;
    }
}
