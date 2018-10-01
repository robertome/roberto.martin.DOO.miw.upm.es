package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.Logic;
import es.upm.miw.iwvg.mastermind.models.Game;

public class LocalLogic implements Logic {

    private Game game;

    private GameControllerBuilder gameControllerBuilder;

    private StartController startController;

    private ContinueController continueController;

    public LocalLogic() {
        game = new Game();
        gameControllerBuilder = new GameControllerBuilder(game);
        startController = new StartController(game, gameControllerBuilder);
        continueController = new ContinueController(game);
    }

    @Override
    public OperationController getOperationController() {
        switch (game.getState()) {
            case INITIAL:
                return startController;
            case IN_GAME:
                return gameControllerBuilder.getGameController();
            case FINAL:
                return continueController;
            case EXIT:
            default:
                return null;
        }
    }
}
