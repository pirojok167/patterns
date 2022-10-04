package Factory.FactoryMethod;

public abstract class PizzaStore {
    public Pizza makePizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }

    public abstract Pizza createPizza(String pizzaType);
}
