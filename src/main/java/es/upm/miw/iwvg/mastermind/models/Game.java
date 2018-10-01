package es.upm.miw.iwvg.mastermind.models;

public class Game {

    public static final int MAX_ATTEMPTS = 10;

    private State state;

    private Board board;

    public Game() {
        state = State.INITIAL;
        newBoard();
    }

    public void clear() {
        newBoard();
    }

    private void newBoard() {
        board = new Board(new Attempt(MAX_ATTEMPTS), new ColorCode().random());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getMaxAttempts() {
        return MAX_ATTEMPTS;
    }

    public boolean isMaxAttemptsExceeded() {
        return board.isMaxAttemptsExceeded();
    }

    public void nextAttempt() {
        board.nextAttempt();
    }

    public void putColorCode(ColorCode colorCode) {
        board.putColorCode(colorCode);
    }

    public ColorCodeCompareResult compareColorCode() {
        return board.compareColorCode();
    }

    public ColorCode getSecretColorCode() {
        return board.getSecretColorCode();
    }


}
