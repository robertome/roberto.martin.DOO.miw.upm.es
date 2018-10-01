package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.ColorCode;
import es.upm.miw.iwvg.mastermind.models.Game;

public class UserGameController extends GameController {

    protected UserGameController(Game game) {
        super(game);
    }

    @Override
    public ColorCode getColorCode() {
        return new ColorCode();
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor) {
        operationControllerVisitor.visit(this);
    }

    @Override
    public void accept(GameControllerVisitor gameControllerVisitor) {
        gameControllerVisitor.visit(this);
    }
}
