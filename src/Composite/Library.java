package Composite;

import java.util.ArrayList;
import java.util.List;

public class Library extends Component {
    List<Component> books = new ArrayList<>();
    String name;

    public Library(String name) {
        this.name = name;
    }

    @Override
    protected void add(Component component) {
        books.add(component);
    }

    @Override
    protected void remove(Component component) {
        books.remove(component);
    }

    protected String getName() {
        return name;
    }

    @Override
    protected void print() {
        System.out.println("Library: " + getName());

        for (Component book: books) {
            book.print();
        }
    }
}
