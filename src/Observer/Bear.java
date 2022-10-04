package Observer;

public class Bear implements Observer {
    private final World world;

    public Bear(Subject subject) {
        this.world = (World) subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        if (world.getCurrentSeason() == Season.Winter) {
            goToSleep();
        } else {
            System.out.println("I'm a bear and I'm hunting");
        }
    }

    private void goToSleep() {
        System.out.println("I'm a bear and I go to sleep");
    }
}
