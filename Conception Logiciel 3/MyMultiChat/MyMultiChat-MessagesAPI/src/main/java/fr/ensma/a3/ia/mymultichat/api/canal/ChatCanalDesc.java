package fr.ensma.a3.ia.mymultichat.api.canal;

public class ChatCanalDesc {

    public static int DEFAULT_MAX_MEMBER_IN_CHANEL = 2;
    private int canalId;
    private String canalName;
    private int currentNumPlayer;
    private int maxPlayer;

    public ChatCanalDesc() {
    }

    public ChatCanalDesc(final int cid, final String name, int numPlayer) {
        canalId = cid;
        canalName = name;
        currentNumPlayer = numPlayer;
        this.maxPlayer = DEFAULT_MAX_MEMBER_IN_CHANEL;
    }

    public ChatCanalDesc(final int cid, final String name) {
        canalId = cid;
        canalName = name;
        currentNumPlayer = 0;
        this.maxPlayer = DEFAULT_MAX_MEMBER_IN_CHANEL;
    }

    public ChatCanalDesc(int canalId, String canalName, int currentNumPlayer, int maxPlayer) {
        this.canalId = canalId;
        this.canalName = canalName;
        this.currentNumPlayer = currentNumPlayer;
        this.maxPlayer = maxPlayer;
    }

    public final int getCanalId() {
        return canalId;
    }

    public final void setCanalId(final int cid) {
        canalId = cid;
    }

    public final void setCanalName(final String name) {
        canalName = name;
    }

    public void setCurrentNumPlayer(int currentNumPlayer) {
        this.currentNumPlayer = currentNumPlayer;
    }

    public String getCanalName() {
        return canalName;
    }

    public int getCurrentNumPlayer() {
        return currentNumPlayer;
    }

    @Override
    public String toString() {
        return canalId + " : -> " + canalName;
    }

    public int getMaxPlayer() {
        return maxPlayer;
    }

}