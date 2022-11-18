package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class NonfictionIterator implements Iterator<Book> {
    Book[] books;

    private int index = 0;

    public NonfictionIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return books.length > index;
    }

    @Override
    public Book next() {
        Book book = books[index];
        index++;
        return book;
    }
}
