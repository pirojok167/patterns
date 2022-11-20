package State;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ShowTime implements State {
    @Override
    public void pressButton(Alarm alarm) {
        System.out.println("Setting the time...");
        alarm.setState(alarm.settingTime);
    }
}
