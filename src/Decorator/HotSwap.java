package Decorator;

public class HotSwap extends ImprovementsDecorator {
    public HotSwap(Keyboard decoratedKeyboard) {
        super(decoratedKeyboard);
    }

    public int price() {
        return super.price() + 512;
    }
}
