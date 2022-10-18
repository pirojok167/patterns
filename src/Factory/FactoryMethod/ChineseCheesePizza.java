package Factory.FactoryMethod;

public class ChineseCheesePizza implements Pizza {
    public ChineseCheesePizza() {
        System.out.println("Add more pepper");
    }

    @Override
    public void prepare() {
        System.out.println("Add flour");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 15 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cut into squares");
    }
}
