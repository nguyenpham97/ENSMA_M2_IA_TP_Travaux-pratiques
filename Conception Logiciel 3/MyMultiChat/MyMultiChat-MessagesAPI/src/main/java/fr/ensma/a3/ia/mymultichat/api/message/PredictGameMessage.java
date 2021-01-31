package fr.ensma.a3.ia.mymultichat.api.message;

public class PredictGameMessage extends ClientMessage {

    private final int predictValue;
    private final String userIdOfPredict;
    private final int tunrNumber;

    public PredictGameMessage(int predictValue, String userIdOfPredict, int tunrNumber, int chanelId) {
        super(chanelId);
        this.predictValue = predictValue;
        this.userIdOfPredict = userIdOfPredict;
        this.tunrNumber = tunrNumber;
    }

    public int getPredictValue() {
        return predictValue;
    }

    public String getUserIdOfPredict() {
        return userIdOfPredict;
    }

    public int getTunrNumber() {
        return tunrNumber;
    }


}
