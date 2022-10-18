package Factory.FactoryMethod;

public class RussianCheesePizza implements Pizza {
    public RussianCheesePizza() {
        System.out.println("Add more mayonnaise");
    }

    @Override
    public void prepare() {
        System.out.println("Add flour");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 17 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cut into slices");
    }
}
