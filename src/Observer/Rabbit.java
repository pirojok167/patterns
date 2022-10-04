package Observer;

public class Rabbit implements Observer {
    private final World world;

    public Rabbit(Subject subject) {
        this.world = (World) subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        if (world.getCurrentSeason() == Season.Winter) {
            changeColour("white");
        } else {
            System.out.println("I'm a rabbit and I'm escaping from the wolf");
        }
    }

    private void changeColour(String colour) {
        System.out.println("I'm a rabbit and my new colour is " + colour);
    }
}
