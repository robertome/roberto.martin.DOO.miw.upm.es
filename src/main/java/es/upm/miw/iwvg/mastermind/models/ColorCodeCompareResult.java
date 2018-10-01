package es.upm.miw.iwvg.mastermind.models;

public class ColorCodeCompareResult {

    private int colorCodeLength;
    private int dead;
    private int injured;


    public ColorCodeCompareResult(int colorCodeLength, int dead, int injured) {
        this.colorCodeLength = colorCodeLength;
        this.dead = dead;
        this.injured = injured;
    }

    public boolean isRightColorCode() {
        return dead == colorCodeLength;
    }

    @Override
    public String toString() {
        return String.format("%d muertos y %d heridos", dead, injured);
    }

}
