package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.models.ColorCodeValidator;
import es.upm.miw.iwvg.mastermind.utils.IO;

public class ColorCodeValidatorView {
    private String title;

    private ColorCodeValidator colorCodeValidator;

    public ColorCodeValidatorView(String title, ColorCodeValidator colorCodeValidator) {
        assert title != null;
        assert colorCodeValidator != null;
        this.title = title;
        this.colorCodeValidator = colorCodeValidator;
    }

    public void writeln() {
        IO.instance().writeln(title + " " + this.toString());
    }

    @Override
    public String toString() {
        return "[" + colorCodeValidator.getColorCodePattern() + "]";
    }

}
