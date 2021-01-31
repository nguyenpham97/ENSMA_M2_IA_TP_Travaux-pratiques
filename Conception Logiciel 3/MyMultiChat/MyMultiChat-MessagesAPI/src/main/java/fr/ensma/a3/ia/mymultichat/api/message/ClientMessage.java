package fr.ensma.a3.ia.mymultichat.api.message;

import java.io.Serializable;

/**
 * Message envoyé par les clients
 *
 * @author michaelrichard
 */
public class ClientMessage implements Serializable {

    private int chanelId;

    public ClientMessage(int chanelId) {
        this.chanelId = chanelId;
    }

    public int getChanelId() {
        return chanelId;
    }

    public void setChanelId(int chanelId) {
        this.chanelId = chanelId;
    }

}