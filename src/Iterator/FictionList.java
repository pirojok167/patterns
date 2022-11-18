package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FictionList implements BookAggregator {
    ArrayList<Book> books;

    public FictionList() {
        books = new ArrayList<>();

        books.add(new Book());
        books.add(new Book());
    }

    @Override
    public Iterator<Book> createIterator() {
        return books.iterator();
    }
}
