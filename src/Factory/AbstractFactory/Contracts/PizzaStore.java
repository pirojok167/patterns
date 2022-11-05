package Factory.AbstractFactory.Contracts;

import Factory.AbstractFactory.Contracts.Pizza;

public interface PizzaStore {
    public Pizza makePizza(String pizzaType);
}
