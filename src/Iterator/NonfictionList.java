package Iterator;

import java.util.Iterator;

public class NonfictionList implements BookAggregator {
    Book[] books;

    public NonfictionList() {
        books = new Book[2];

        books[0] = new Book();
        books[1] = new Book();
    }

    @Override
    public Iterator<Book> createIterator() {
        return new NonfictionIterator(books);
    }
}
