package Facade;

public class CoffeeMachine {
    Cezve cezve;
    Coffee coffee;

    public CoffeeMachine(Cezve cezve, Coffee coffee) {
        this.cezve = cezve;
        this.coffee = coffee;
    }

    public void brewCoffee() {
        coffee.grind();
        cezve.heat();
        // ...
    }
}
