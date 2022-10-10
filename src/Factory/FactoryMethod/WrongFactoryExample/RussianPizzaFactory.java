package Factory.FactoryMethod.WrongFactoryExample;

import Factory.FactoryMethod.ChineseCheesePizza;
import Factory.FactoryMethod.ChinesePepperoniPizza;
import Factory.FactoryMethod.Pizza;

public class RussianPizzaFactory {
    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("Greek")) {
            return new ChineseCheesePizza();
        }

        putMorePepper();

        return new ChinesePepperoniPizza();
    }

    private void putMorePepper() {}
}
