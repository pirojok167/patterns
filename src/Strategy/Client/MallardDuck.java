package Strategy.Client;

import Strategy.Fly.FlyBehavior;
import Strategy.Quack.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}
