package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.State;

public class ContinueController extends OperationController {

    ContinueController(Game game) {
        super(game);
    }

    public void setContinue(boolean another) {
        assert this.getState() == State.FINAL;
        if (another) {
            this.clear();
            this.setState(State.INITIAL);
        } else {
            this.setState(State.EXIT);
        }
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor) {
        operationControllerVisitor.visit(this);
    }

}
