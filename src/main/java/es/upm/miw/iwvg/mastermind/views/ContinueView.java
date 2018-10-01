package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.controllers.ContinueController;
import es.upm.miw.iwvg.mastermind.utils.YesNoDialog;

class ContinueView {

    void interact(ContinueController continueController) {
        continueController.setContinue(YesNoDialog.instance()
                .read("¿Desea continuar?"));
    }
}
