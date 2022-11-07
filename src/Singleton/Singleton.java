package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        return instance != null ? instance : new Singleton();
    }
}
