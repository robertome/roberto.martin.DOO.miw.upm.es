package es.upm.miw.iwvg.mastermind;


import es.upm.miw.iwvg.mastermind.controllers.LocalLogic;
import es.upm.miw.iwvg.mastermind.controllers.OperationController;
import es.upm.miw.iwvg.mastermind.views.MastermindView;

public class Mastermind {

    private Logic logic;

    private View view;

    public Mastermind(View view, Logic logic) {
        this.view = view;
        this.logic = logic;
    }

    public static void main(String[] args) {
        new Mastermind(new MastermindView(), new LocalLogic()).play();
    }

    public void play() {
        OperationController controller;
        do {
            controller = logic.getOperationController();
            if (controller != null) {
                view.interact(controller);
            }
        } while (controller != null);
    }

}
