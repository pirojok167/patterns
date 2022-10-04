package Factory.FactoryMethod;

public class RussianPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        addMoreVegetables();

        if (pizzaType.equals("Greek")) {
            return new RussianCheesePizza();
        }

        return new RussianPepperoniPizza();
    }

    private void addMoreVegetables() {

    }
}
