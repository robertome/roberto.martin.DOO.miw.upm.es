package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.ColorCode;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.State;

public abstract class Controller {

    protected Game game;

    protected Controller(Game game) {
        assert game != null;
        this.game = game;
    }

    protected State getState() {
        return game.getState();
    }

    protected void setState(State state) {
        assert state != null;
        game.setState(state);
    }

    protected int getMaxAttempts() {
        return game.getMaxAttempts();
    }

    public ColorCode getSecretColorCode() {
        return game.getSecretColorCode();
    }

    public void clear() {
        game.clear();
    }

}
