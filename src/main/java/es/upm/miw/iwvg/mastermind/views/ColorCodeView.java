package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.models.ColorCode;
import es.upm.miw.iwvg.mastermind.utils.IO;

public class ColorCodeView {

    private static final String ATTEMPT_MSG = "Intento? [cuatro letras de entre A-amarillo, R-rojo, V-verde, Z-azul, B-blanco, N-negro]: ";


    private ColorCode colorCode;

    ColorCodeView(ColorCode colorCode) {
        this.colorCode = colorCode;
    }

    void read() {
        colorCode.setCode(ColorCodeDialog.instance().read(ATTEMPT_MSG, ColorCode.PATTERN));
    }

    void write() {
        IO.instance().writeln(ATTEMPT_MSG + colorCode);
    }

    public void writeSecretColorCode() {
        //IO.instance().writeln("Código Secreto: " + secret(colorCode.toString()));
        IO.instance().writeln("Código Secreto: " + colorCode.toString());
    }

    private String secret(String string) {
        StringBuilder sb = new StringBuilder();
        int length = string.length();
        for (int i = 0; i < length; i++) {
            sb.append("*");
        }

        return sb.toString();
    }
}
