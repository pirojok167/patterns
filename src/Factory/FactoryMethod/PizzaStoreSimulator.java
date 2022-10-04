package Factory.FactoryMethod;

public class PizzaStoreSimulator {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChinesePizzaStore();
        Pizza pizza = pizzaStore.makePizza("cheese");

        System.out.println(pizza);
    }
}
