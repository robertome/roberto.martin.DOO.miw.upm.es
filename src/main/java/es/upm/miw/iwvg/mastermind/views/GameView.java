package es.upm.miw.iwvg.mastermind.views;


import es.upm.miw.iwvg.mastermind.controllers.GameController;
import es.upm.miw.iwvg.mastermind.controllers.GameControllerVisitor;
import es.upm.miw.iwvg.mastermind.controllers.RandomGameController;
import es.upm.miw.iwvg.mastermind.controllers.UserGameController;
import es.upm.miw.iwvg.mastermind.models.ColorCode;
import es.upm.miw.iwvg.mastermind.models.ColorCodeCompareResult;
import es.upm.miw.iwvg.mastermind.utils.IO;

class GameView implements GameControllerVisitor {

    private ColorCodeView colorCodeView;

    void interact(GameController gameController) {
        ColorCode colorCode = gameController.getColorCode();
        colorCodeView = new ColorCodeView(colorCode);
        gameController.accept(this);
        gameController.putColorCode(colorCode);
        ColorCodeCompareResult result = gameController.compareColorCode();
        IO.instance().writeln(result.toString());
        if (result.isRightColorCode()) {
            writeWinner();
        } else if (gameController.isMaxAttemptsExceeded()) {
            writeLooser(gameController.getSecretColorCode());
        }
    }

    @Override
    public void visit(RandomGameController randomGameController) {
        IO.instance().readString("DEMO Pulse enter para continuar");
        colorCodeView.write();
    }

    @Override
    public void visit(UserGameController userGameController) {
        colorCodeView.read();
    }

    private void writeWinner() {
        IO.instance().writeln("Ganaste!!!!");
    }

    private void writeLooser(ColorCode secretColorCode) {
        IO.instance().writeln("Perdiste!!!! Código Secreto: " + secretColorCode);
    }
}
