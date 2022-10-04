package Strategy;

import Strategy.Client.Duck;
import Strategy.Client.MallardDuck;
import Strategy.Client.RubberDuck;
import Strategy.Fly.FlyNoWay;
import Strategy.Fly.FlyWithWings;
import Strategy.Quack.MuteQuack;
import Strategy.Quack.Quack;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new Quack(), new FlyWithWings());
        Duck rubberDuck = new RubberDuck(new MuteQuack(), new FlyNoWay());

        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println();

        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }
}
