package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.models.Color;
import es.upm.miw.iwvg.mastermind.models.ColorCode;
import es.upm.miw.iwvg.mastermind.utils.IO;

import java.util.Arrays;
import java.util.stream.Collectors;

class ColorCodeView {

    private static final String ATTEMPT_MSG =
            String.format("Intento? [cuatro letras de entre %s]: ", Arrays.stream(Color.values()).map(color -> color.toString()).collect(Collectors.joining(",")));

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

    void writeSecretColorCode() {
        IO.instance().writeln("Código Secreto: " + secret(colorCode.toString()));
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
