package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.ColorCode;
import es.upm.miw.iwvg.mastermind.models.ColorCodeCompareResult;
import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.State;

public abstract class GameController extends OperationController {

    protected GameController(Game game) {
        super(game);
    }

    public abstract void accept(GameControllerVisitor GameControllerVisitor);

    public abstract ColorCode getColorCode();


    public boolean isMaxAttemptsExceeded() {
        return game.getState() == State.FINAL && game.isMaxAttemptsExceeded();
    }

    public ColorCodeCompareResult compareColorCode() {
        return game.compareColorCode();
    }

    public void putColorCode(ColorCode colorCode) {
        assert colorCode != null;
        game.putColorCode(colorCode);
        ColorCodeCompareResult result = game.compareColorCode();
        if (result.isRightColorCode() || game.isMaxAttemptsExceeded()) {
            game.setState(State.FINAL);
        } else {
            game.nextAttempt();
        }
    }

}
