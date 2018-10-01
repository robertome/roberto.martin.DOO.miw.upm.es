package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.View;
import es.upm.miw.iwvg.mastermind.controllers.*;

public class MastermindView implements View, OperationControllerVisitor {

    private StartView startView;

    private GameView gameView;

    private ContinueView continueView;

    public MastermindView() {
        startView = new StartView();
        gameView = new GameView();
        continueView = new ContinueView();
    }

    @Override
    public void interact(OperationController operationController) {
        assert operationController != null;
        operationController.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        startView.interact(startController);
    }

    @Override
    public void visit(GameController gameController) {
        gameView.interact(gameController);
    }

    @Override
    public void visit(ContinueController continueController) {
        continueView.interact(continueController);
    }

}
