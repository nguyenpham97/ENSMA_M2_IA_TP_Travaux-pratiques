package fr.ensma.a3.ia.mymultichat.server.websocket;

import fr.ensma.a3.ia.mymultichat.api.entities.TurnGame;
import java.util.Map;

/**
 *
 * @author namhcn
 */
public class ChanelData {

    public static enum StatusChanel {
        WAIT_TO_START, STARTED
    }
    private int chanelID;
    private StatusChanel statusChanel;
    private Map<String, ConnectSocketObject> userIdConnectSocketObject;
    private TurnGame turnGame;
    public ChanelData(int chanelID, Map<String, ConnectSocketObject> userId_connectSocketObject) {
        this(chanelID, StatusChanel.WAIT_TO_START, userId_connectSocketObject);
    }

    public ChanelData(int chanelID, StatusChanel statusChanel, Map<String, ConnectSocketObject> userId_connectSocketObject) {
        this.chanelID = chanelID;
        this.statusChanel = statusChanel;
        this.userIdConnectSocketObject = userId_connectSocketObject;
    }

    public int getChanelID() {
        return chanelID;
    }

    public StatusChanel getStatusChanel() {
        return statusChanel;
    }



    public Map<String, ConnectSocketObject> getUserIdConnectSocketObject() {
        return userIdConnectSocketObject;
    }

    public ConnectSocketObject getConnectSocketObject(String userId) {
        return userIdConnectSocketObject.get(userId);
    }

    public void addConnectSocketObject(String userId, ConnectSocketObject scConnectSocketObject) {
        this.userIdConnectSocketObject.put(userId, scConnectSocketObject);
    }

    public void setStatusChanel(StatusChanel statusChanel) {
        this.statusChanel = statusChanel;
    }

    public TurnGame getTurnGame() {
        return turnGame;
    }

    public void setTurnGame(TurnGame turnGame) {
        this.turnGame = turnGame;
    }
    
}