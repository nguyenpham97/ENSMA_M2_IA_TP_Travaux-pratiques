package fr.ensma.a3.ia.mymultichat.api.message;

import fr.ensma.a3.ia.mymultichat.api.entities.User;

/**
 *
 * @author lammi
 */
public class DisconectAlertMessage extends ClientMessage {

    private final User disconectedUser;

    public DisconectAlertMessage(int chanelId, User disconectedUser) {
        super(chanelId);
        this.disconectedUser = disconectedUser;
    }

    public User getUser() {
        return disconectedUser;
    }

}