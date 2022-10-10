package Factory.SimpleFactory;

public class PizzaStore {
    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

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
