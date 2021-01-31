package fr.ensma.a3.ia.mymultichat.api.entities;

public enum SocketAction {

    NEW_USER("newuser");

    private final String action;

    public String getAction() {
        return this.action;
    }

    private SocketAction(String action) {
        this.action = action;
    }

    public static SocketAction findValue(String action) {
        if (action.equals("newuser")) {
            return NEW_USER;
        }
        return null;
    }
}