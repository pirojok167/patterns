package Factory.FactoryMethod;

public class RussianPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("Greek")) {
            return new RussianCheesePizza();
        }

        return new RussianPepperoniPizza();
    }
}
