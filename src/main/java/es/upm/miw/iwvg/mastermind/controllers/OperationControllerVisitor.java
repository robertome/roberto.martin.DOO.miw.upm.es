package es.upm.miw.iwvg.mastermind.controllers;

public interface OperationControllerVisitor {

    void visit(StartController startController);

    void visit(GameController gameController);

    void visit(ContinueController continueController);

}

