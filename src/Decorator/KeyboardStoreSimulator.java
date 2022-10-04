package Decorator;

public class KeyboardStoreSimulator {
    public static void main(String[] args) {
        Keyboard varmilo = new Varmilo();
        Keyboard leopold = new Leopold();

        ImprovementsDecorator varmiloWithHotSwap = new HotSwap(varmilo);
        ImprovementsDecorator leopoldWithFoam = new Foam(leopold);

        System.out.println(varmiloWithHotSwap.getModel());
        System.out.println(varmiloWithHotSwap.price() + "$");

        System.out.println();

        System.out.println(leopoldWithFoam.getModel());
        System.out.println(leopoldWithFoam.price() + "$");
    }
}
