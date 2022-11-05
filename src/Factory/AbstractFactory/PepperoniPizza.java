package Factory.AbstractFactory;

import Factory.AbstractFactory.Contracts.Pizza;
import Factory.AbstractFactory.Contracts.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing pepperoni pizza");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
