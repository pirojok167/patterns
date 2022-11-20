package State;

import java.time.LocalTime;

public class SettingTime implements State {
    @Override
    public void pressButton(Alarm alarm) {
        System.out.println("Setting the alarm...");
        alarm.setState(alarm.settingAlarm);
    }
}
