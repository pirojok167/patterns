package Factory.FactoryMethod;

public class RussianPepperoniPizza implements Pizza {
    public RussianPepperoniPizza() {
        System.out.println("Add more mayonnaise");
    }

    @Override
    public void prepare() {
        System.out.println("Add flour");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 20 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cut into slices");
    }
}
