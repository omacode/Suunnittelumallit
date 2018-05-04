package observer;

public class Main {
    
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer(0, 0, 0);
        DigitalClock clock = new DigitalClock(timer);
        timer.run();
    } 
    
}
