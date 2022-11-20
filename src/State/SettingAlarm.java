package State;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SettingAlarm implements State {
    @Override
    public void pressButton(Alarm alarm) {
        System.out.println("Local time: " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        alarm.setState(alarm.showTime);
    }
}
