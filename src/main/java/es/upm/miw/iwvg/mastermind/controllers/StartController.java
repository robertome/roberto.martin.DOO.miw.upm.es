package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.Game;
import es.upm.miw.iwvg.mastermind.models.State;
import es.upm.miw.iwvg.mastermind.utils.ClosedInterval;

public class StartController extends OperationController {

    private GameControllerBuilder gameControllerBuilder;

    StartController(Game game, GameControllerBuilder gameControllerBuilder) {
        super(game);
        assert this.gameControllerBuilder != null;
        this.gameControllerBuilder = gameControllerBuilder;
    }

    public void setGameOption(int gameOption) {
        assert new ClosedInterval(0, this.getMaxAttempts()).includes(gameOption);
        assert this.getState() == State.INITIAL;
        gameControllerBuilder.build(gameOption);
        this.setState(State.IN_GAME);
    }

    @Override
    public void accept(OperationControllerVisitor operationControllerVisitor) {
        operationControllerVisitor.visit(this);
    }

}
