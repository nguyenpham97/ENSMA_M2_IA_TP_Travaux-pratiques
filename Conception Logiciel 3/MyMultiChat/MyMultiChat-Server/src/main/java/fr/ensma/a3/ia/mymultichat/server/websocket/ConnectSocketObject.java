package fr.ensma.a3.ia.mymultichat.server.websocket;

import fr.ensma.a3.ia.mymultichat.api.entities.User;
import javax.websocket.Session;

public class ConnectSocketObject {
    private User user;
    private Session session;

    public ConnectSocketObject(User user, Session session) {
        this.user = user;
        this.session = session;
    }

    public User getUser() {
        return user;
    }

    public Session getSession() {
        return session;
    }

}