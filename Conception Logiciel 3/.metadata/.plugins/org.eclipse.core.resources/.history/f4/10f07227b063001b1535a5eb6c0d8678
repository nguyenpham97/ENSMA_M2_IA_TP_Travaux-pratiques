package fr.ensma.a3.ia.mymultichat.api.entities;

import java.io.Serializable;
//import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author namhcn
 */
public class TurnGame implements Serializable {

    public static int MAX_VICTORY_VALUE = 100;
    private User turnUser;
    private final int victortyValue;
    private int turnNumber;

    public TurnGame(User user, int turnNumber) {
    	this.victortyValue = RandomUtils.nextInt(0, MAX_VICTORY_VALUE + 1);
        this.turnUser = user;
        this.turnNumber = turnNumber;
    }

    public TurnGame(User user, int turnNumber, int victortyValue) {
        this.victortyValue = victortyValue > MAX_VICTORY_VALUE ? MAX_VICTORY_VALUE : victortyValue;
        this.turnUser = user;
        this.turnNumber = turnNumber;
    }

    public User getTurnUser() {
        return turnUser;
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public int getVictortyValue() {
        return victortyValue;
    }

    public void setTurnUser(User turnUser) {
        this.turnUser = turnUser;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

}