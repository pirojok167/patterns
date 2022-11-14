package TemplateMethod;

public class Coffee extends HotBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping through filter");
    }

    @Override
    protected boolean personWantsSugar() {
        return true;
    }
}
