package Factory.FactoryMethod;

public class ChinesePepperoniPizza implements Pizza {
    public ChinesePepperoniPizza() {
        System.out.println("Add more pepper");
        System.out.println("Add less salt");
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
