package State;

public class Alarm {
    public State showTime;
    public State settingTime;
    public State settingAlarm;

    private State state;

    public Alarm() {
        showTime = new ShowTime();
        settingTime = new SettingTime();
        settingAlarm = new SettingAlarm();

        state = showTime;
    }

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        alarm.pressButton();
        alarm.pressButton();
        alarm.pressButton();
    }

    public void setState(State state) {
        this.state = state;
    }

    private void pressButton() {
        state.pressButton(this);
    }
}
