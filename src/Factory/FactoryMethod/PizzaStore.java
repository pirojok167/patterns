package Factory.FactoryMethod;

public abstract class PizzaStore {
    public static void main(String[] args) {
        PizzaStore chinesePizzaStore = new ChinesePizzaStore();
        Pizza chinesePizza = chinesePizzaStore.makePizza("cheese");

        System.out.println(chinesePizza);
        System.out.println();

        PizzaStore russianPizzaStore = new RussianPizzaStore();
        Pizza russianPizza = russianPizzaStore.makePizza("cheese");

        System.out.println(russianPizza);
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
