package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.controllers.OperationController;
import es.upm.miw.iwvg.mastermind.utils.IO;

class BoardView {

    private OperationController controller;

    BoardView(OperationController controller) {
        assert controller != null;
        this.controller = controller;
    }

    void write() {
        new ColorCodeView(controller.getSecretColorCode()).writeSecretColorCode();
    }
}
