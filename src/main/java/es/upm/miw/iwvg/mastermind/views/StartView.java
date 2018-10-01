package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.controllers.StartController;
import es.upm.miw.iwvg.mastermind.utils.LimitedIntDialog;

class StartView {


    void interact(StartController startController) {
        int option = LimitedIntDialog.instance().read("1.- Partida, 2.- Demo. ¿Opción?:", 1, 2);
        startController.setGameOption(option);
        new BoardView(startController).write();
    }
}
