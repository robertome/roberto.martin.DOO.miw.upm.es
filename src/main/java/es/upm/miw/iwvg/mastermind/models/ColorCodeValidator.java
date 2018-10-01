package es.upm.miw.iwvg.mastermind.models;

public class ColorCodeValidator {

    private final String colorCodePattern;

    public ColorCodeValidator(String colorCodePattern) {
        assert colorCodePattern != null;
        this.colorCodePattern = colorCodePattern;
    }

    public boolean validate(String value) {
        assert value != null;
        return value.matches(colorCodePattern);
    }

    public String getColorCodePattern() {
        return colorCodePattern;
    }
}
