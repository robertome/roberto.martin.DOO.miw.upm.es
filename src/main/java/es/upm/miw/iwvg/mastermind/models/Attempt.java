package es.upm.miw.iwvg.mastermind.models;

class Attempt {

    private int currentAttempt = 1;
    private int maxAttempts;

    public Attempt(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public void next() {
        currentAttempt++;
    }

    public boolean isMaxAttemptsExceeded() {
        return maxAttempts <= currentAttempt;
    }

}
