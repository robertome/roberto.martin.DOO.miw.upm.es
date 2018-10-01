package es.upm.miw.iwvg.mastermind.controllers;

public interface GameControllerVisitor {

    void visit(RandomGameController randomGameController);

    void visit(UserGameController userGameController);

}
