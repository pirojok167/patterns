package Factory.AbstractFactory.RussianPizza;

import Factory.AbstractFactory.Contracts.Ingredients.Cheese;
import Factory.AbstractFactory.Contracts.Ingredients.Dough;
import Factory.AbstractFactory.Contracts.Ingredients.Pepperoni;
import Factory.AbstractFactory.Contracts.Ingredients.Sauce;
import Factory.AbstractFactory.Contracts.PizzaIngredientFactory;
import Factory.AbstractFactory.RussianPizza.Ingredients.BoiledSausage;
import Factory.AbstractFactory.RussianPizza.Ingredients.Mayonnaise;
import Factory.AbstractFactory.RussianPizza.Ingredients.RussianCheese;
import Factory.AbstractFactory.RussianPizza.Ingredients.ThickDough;

public class RussianPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new Mayonnaise();
    }

    @Override
    public Cheese createCheese() {
        return new RussianCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new BoiledSausage();
    }
}
