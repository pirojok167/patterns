package Factory.FactoryMethod;

public class ChinesePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("cheese")) {
            return new ChineseCheesePizza();
        }

        return new ChinesePepperoniPizza();
    }
}
