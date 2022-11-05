package Factory.AbstractFactory.Contracts;

import Factory.AbstractFactory.Contracts.Ingredients.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
}
