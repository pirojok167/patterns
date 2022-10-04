package Decorator;

public class ImprovementsDecorator implements Keyboard {
    private final Keyboard decoratedKeyboard;

    public ImprovementsDecorator(Keyboard decoratedKeyboard) {
        this.decoratedKeyboard = decoratedKeyboard;
    }

    public String getModel() {
        return decoratedKeyboard.getModel();
    }

    public int price() {
        return decoratedKeyboard.price();
    }
}
