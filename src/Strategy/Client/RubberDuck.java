package Strategy.Client;

import Strategy.Fly.FlyBehavior;
import Strategy.Quack.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber duck");
    }
}
