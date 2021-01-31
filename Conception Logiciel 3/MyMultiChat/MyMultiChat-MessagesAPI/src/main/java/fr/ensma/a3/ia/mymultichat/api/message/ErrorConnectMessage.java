package fr.ensma.a3.ia.mymultichat.api.message;

public class ErrorConnectMessage extends ClientMessage {

    public static  enum ERROR_CONNECT {
        ROOM_PLAYING
    }
    private final ERROR_CONNECT error_connect;

    public ErrorConnectMessage(int chanelId, ERROR_CONNECT error_connect) {
        super(chanelId);
        this.error_connect = error_connect;
    }

    public ERROR_CONNECT getError_connect() {
        return error_connect;
    }

}