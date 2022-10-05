package Factory.SimpleFactory;

public class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        Pizza pizza = pizzaStore.makePizza("cheese");

        System.out.println(pizza);
    }

    public Pizza makePizza(String pizzaType) {
        Pizza pizza = pizzaFactory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }
}
