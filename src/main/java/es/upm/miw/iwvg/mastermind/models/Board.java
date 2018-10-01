package es.upm.miw.iwvg.mastermind.models;

class Board {

    Attempt attempt;
    ColorCode secretColorCode;
    ColorCode actualColorCode;

    public Board(Attempt attempt, ColorCode secretColorCode) {
        this.attempt = attempt;
        this.secretColorCode = secretColorCode;
    }

    void putColorCode(ColorCode colorCode) {
        actualColorCode = colorCode;
    }

    ColorCodeCompareResult compareColorCode() {
        return secretColorCode.compare(actualColorCode);
    }

    boolean isMaxAttemptsExceeded() {
        return attempt.isMaxAttemptsExceeded();
    }

    public void nextAttempt() {
        attempt.next();
    }

    public ColorCode getSecretColorCode() {
        return secretColorCode;
    }
}
