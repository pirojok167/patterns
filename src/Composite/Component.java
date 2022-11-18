package Composite;

public abstract class Component {
    protected void add(Component component) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    protected String getName() {
        throw new UnsupportedOperationException();
    }

    protected int getPrice() {
        throw new UnsupportedOperationException();
    }

    protected void print() {
        throw new UnsupportedOperationException();
    }
}
