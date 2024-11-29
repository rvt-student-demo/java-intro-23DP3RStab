package lv.rvt;

public class Timer {
    private ClockHand seconds;
    private ClockHand hudredsOfSecond;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hudredsOfSecond = new ClockHand(100);
    }

    public void advance() {
        this.hudredsOfSecond.advance();

        if (this.hudredsOfSecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + " : " + this.hudredsOfSecond;
    }
}
