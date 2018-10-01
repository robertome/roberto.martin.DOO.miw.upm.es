package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.Game;

public abstract class OperationController extends Controller {

    protected OperationController(Game game) {
        super(game);
    }

    public abstract void accept(OperationControllerVisitor operationControllerVisitor);

}
