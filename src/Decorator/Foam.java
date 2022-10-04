package Decorator;

public class Foam extends ImprovementsDecorator {
    public Foam(Keyboard decoratedKeyboard) {
        super(decoratedKeyboard);
    }

    public int price() {
        return super.price() + 256;
    }
}
