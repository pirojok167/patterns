package Factory.AbstractFactory;

import Factory.AbstractFactory.Contracts.Pizza;
import Factory.AbstractFactory.Contracts.PizzaIngredientFactory;
import Factory.AbstractFactory.Contracts.PizzaStore;
import Factory.AbstractFactory.RussianPizza.RussianPizzaIngredientFactory;

public class RussianPizzaStore implements PizzaStore {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new RussianPizzaStore();
        Pizza pizza = pizzaStore.makePizza("pepperoni");

        System.out.println(pizza);
    }

    @Override
    public Pizza makePizza(String pizzaType) {
        PizzaIngredientFactory ingredientFactory = new RussianPizzaIngredientFactory();

        if (pizzaType.equals("pepperoni")) {
            Pizza pizza = new PepperoniPizza(ingredientFactory);
            pizza.prepare();
            pizza.bake();
            pizza.cut();

            return pizza;
        }

        throw new RuntimeException("Unsupported pizza");
    }
}
