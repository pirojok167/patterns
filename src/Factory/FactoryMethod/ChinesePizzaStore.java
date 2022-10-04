package Factory.FactoryMethod;

public class ChinesePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        addMorePepper();

        if (pizzaType.equals("cheese")) {
            return new ChineseCheesePizza();
        }

        return new ChinesePepperoniPizza();
    }

    private void addMorePepper() {

    }
}
