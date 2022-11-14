package TemplateMethod;

public class Tea extends HotBeverage {
    @Override
    protected void brew() {
        System.out.println("Brewing in the mug");
    }
}
