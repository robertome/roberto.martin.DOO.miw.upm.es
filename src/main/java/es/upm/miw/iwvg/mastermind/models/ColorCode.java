package es.upm.miw.iwvg.mastermind.models;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class ColorCode {

    public static int LENGTH = 4;
    public static final String PATTERN = String.format("^[%s]{%d}$", Arrays.stream(Color.values()).map(color -> String.valueOf(color.value())).collect(Collectors.joining()), LENGTH);

    private String code;

    public void setCode(String code) {
        assert code != null;
        this.code = code;
    }


    public ColorCode random() {
        Random random = new Random(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LENGTH; i++) {
            Color color = Color.values()[random.nextInt(Color.values().length)];
            sb.append(color.value());
        }

        code = sb.toString();

        return this;
    }

    @Override
    public String toString() {
        return code;
    }


    public ColorCodeCompareResult compare(ColorCode colorCode) {
        int dead = 0;
        int injured = 0;

        int length = code.length();
        for (int i = 0; i < length; i++) {
            char color = colorCode.code.charAt(i);
            if (this.code.charAt(i) == color) {
                dead++;
            } else if (this.code.indexOf(color) != -1) {
                injured++;
            }
        }

        return new ColorCodeCompareResult(LENGTH, dead, injured);
    }
}
