package Factory.FactoryMethod.InflexibleFactoryExample;

import Factory.FactoryMethod.ChineseCheesePizza;
import Factory.FactoryMethod.ChinesePepperoniPizza;
import Factory.FactoryMethod.Pizza;

public class ChinesePizzaFactory {
    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("Greek")) {
            return new ChineseCheesePizza();
        }

        return new ChinesePepperoniPizza();
    }
}
