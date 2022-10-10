package Factory.FactoryMethod;

public abstract class PizzaStore {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChinesePizzaStore();
        Pizza pizza = pizzaStore.makePizza("cheese");

        System.out.println(pizza);
    }

    public Pizza makePizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }

    public abstract Pizza createPizza(String pizzaType);
}
