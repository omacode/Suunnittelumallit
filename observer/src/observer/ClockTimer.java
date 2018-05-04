
package observer;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClockTimer extends Observable implements Runnable{
    
    private int hour;
    private int minute;
    private int second;

    public ClockTimer(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    int getHour() {
        return this.hour;
    }

    int getMinute() {
        return this.minute;
    }

    int getSecond() {
        return this.second;
    }
    
    void tick() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            
            this.minute++;
            if (this.minute == 60) {
                this.minute = 0;
                
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        
        setChanged();
        notifyObservers(this);
    }

    @Override
    public void run() {
        while (true) {            
            this.tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
