package fr.ensma.a3.ia.mymultichat.api.message;

import fr.ensma.a3.ia.mymultichat.api.entities.User;

/**
 *
 * @author lammi
 */
public class ResultPredictMessage extends ClientMessage {

    public static enum ERROR_PREDICT {
        EXCEPTION, WAITING_START_GAME, SUCCESS, WRONG_TURN, TOO_SMALL, TOO_BIG
    }
    private final ERROR_PREDICT error_predict;
    private final User turnUser;
    private final int predictValue;

    public ResultPredictMessage(int chanelId, ERROR_PREDICT error_predict) {
        super(chanelId);
        this.turnUser = null;
        this.predictValue = -1;
        this.error_predict = error_predict;
    }

    public ResultPredictMessage(int chanelId, User turnUser, int predictValue, ERROR_PREDICT error_predict) {
        super(chanelId);
        this.turnUser = turnUser;
        this.predictValue = predictValue;
        this.error_predict = error_predict;
    }

    public int getPredictValue() {
        return predictValue;
    }

    public ERROR_PREDICT getError_predict() {
        return error_predict;
    }

    public User getTurnUser() {
        return turnUser;
    }

}