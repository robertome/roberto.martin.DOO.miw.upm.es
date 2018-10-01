package es.upm.miw.iwvg.mastermind.models;

public enum Color {
    YELLOW('A', "amarillo"),
    RED('R', "rojo"),
    VERDE('V', "verde"),
    BLUE('Z', "azul"),
    WHITE('B', "blanco"),
    BLACK('N', "negro");

    private char value;
    private String name;

    private Color(char value, String name) {
        this.value = value;
        this.name = name;
    }

    public char value() {
        return value;
    }

    @Override
    public String toString() {
        return value + "-" + name;
    }
}