package Factory.AbstractFactory.Contracts;

import Factory.AbstractFactory.Contracts.Ingredients.*;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    protected Pepperoni pepperoni;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 20 minutes");
    }

    public void cut() {
        System.out.println("Cutting the pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
