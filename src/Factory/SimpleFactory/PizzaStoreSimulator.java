package Factory.SimpleFactory;

public class PizzaStoreSimulator {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        Pizza pizza = pizzaStore.makePizza("cheese");

        System.out.println(pizza);
    }
}
