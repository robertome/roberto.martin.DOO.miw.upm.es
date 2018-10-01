package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.Game;

class GameControllerBuilder {

    private Game game;
    private OperationController gameController;

    public GameControllerBuilder(Game game) {
        this.game = game;
    }

    public void build(int gameOption) {
        gameController = (gameOption == 1) ? new UserGameController(game) : new RandomGameController(game);
    }

    public OperationController getGameController() {
        return gameController;
    }
}
