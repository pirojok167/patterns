package Factory.SimpleFactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("Greek")) {
            return new CheesePizza();
        }

        return new PepperoniPizza();
    }
}
