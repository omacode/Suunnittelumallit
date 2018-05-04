package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.addObserver(this);
    }   
    
    @Override
    public void update(Observable o, Object arg) {
        if (arg == timer) {
            draw();
        }
    }
    
    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        
        String zeroForHour = "";
        if (hour < 10) {
            zeroForHour = "0";
        }
        
        String zeroForMinute = "";
        if (minute < 10) {
            zeroForMinute = "0";
        }
        
        String zeroForSecond = "";
        if (second < 10) {
            zeroForSecond = "0";
        }
        
        System.out.println(zeroForHour + hour + ":" + zeroForMinute + minute + ":" + zeroForSecond + second);
    }
}
