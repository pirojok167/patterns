package TemplateMethod;

public abstract class HotBeverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (personWantsSugar()) {
            addSugar();
        }
    }

    private void boilWater() {
        System.out.println("Boiling the water");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring in the cup");
    }

    protected void addSugar() {
        System.out.println("Added sugar");
    }

    protected boolean personWantsSugar() {
        return false;
    }
}
