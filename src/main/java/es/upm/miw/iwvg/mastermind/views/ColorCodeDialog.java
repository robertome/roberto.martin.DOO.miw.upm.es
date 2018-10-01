package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.models.ColorCodeValidator;
import es.upm.miw.iwvg.mastermind.utils.IO;

public class ColorCodeDialog {

    private static ColorCodeDialog limitedColorCodeDialog;

    private ColorCodeDialog() {
    }

    public static ColorCodeDialog instance() {
        if (limitedColorCodeDialog == null) {
            limitedColorCodeDialog = new ColorCodeDialog();
        }
        return limitedColorCodeDialog;
    }

    public String read(String title, String colorCodePattern) {
        assert title != null;
        ColorCodeValidator validator = new ColorCodeValidator(colorCodePattern);
        ColorCodeValidatorView limitsView = new ColorCodeValidatorView(
                "El valor del código debe coincidir con la expresión: ", validator);

        String value;
        boolean ok;
        do {
            value = IO.instance().readString(title);
            ok = validator.validate(value);
            if (!ok) {
                limitsView.writeln();
            }
        } while (!ok);

        return value;
    }

}
