package Factory.AbstractFactory.ChinesePizza;

import Factory.AbstractFactory.ChinesePizza.Ingredients.HotPepperoni;
import Factory.AbstractFactory.ChinesePizza.Ingredients.SweetSauce;
import Factory.AbstractFactory.ChinesePizza.Ingredients.ThinDough;
import Factory.AbstractFactory.Contracts.Ingredients.Cheese;
import Factory.AbstractFactory.Contracts.Ingredients.Dough;
import Factory.AbstractFactory.Contracts.Ingredients.Pepperoni;
import Factory.AbstractFactory.Contracts.Ingredients.Sauce;
import Factory.AbstractFactory.Contracts.PizzaIngredientFactory;

public class ChinesePizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new SweetSauce();
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new HotPepperoni();
    }
}
