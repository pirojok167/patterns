package Composite;

import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {
        Component harryPotter = new Book("philosopher's Stone", 300);
        Component bestBook = new Book("100 years of solitude", 750);

        Component library = new Library("All books");

        library.add(harryPotter);
        library.add(bestBook);

        library.print();
    }
}
