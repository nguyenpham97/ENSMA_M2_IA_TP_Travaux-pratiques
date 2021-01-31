package fr.ensma.a3.ia.mymultichat.api.message;

import fr.ensma.a3.ia.mymultichat.api.entities.TurnGame;
import fr.ensma.a3.ia.mymultichat.api.entities.User;

public class TurnGameMessage extends ClientMessage {

    private TurnGame turnGame;

    public TurnGameMessage(int chanelId, TurnGame turnGame) {
        super(chanelId);
        this.turnGame = turnGame;
    }

    public User getTurnUser() {
        return turnGame.getTurnUser();
    }

    public int getTurnNumber() {
        return turnGame.getTurnNumber();
    }

    public int getVictortyValue() {
        return turnGame.getVictortyValue();
    }

}
