package Iterator;

import java.util.Iterator;

public class BookStore {
    public static void main(String[] args) {
        BookAggregator fictionBooks = new FictionList();
        BookAggregator nonfictionBooks = new NonfictionList();

        Iterator<Book> fictionIterator = fictionBooks.createIterator();
        Iterator<Book> nonfictionIterator = nonfictionBooks.createIterator();

        printBooks(fictionIterator);
        printBooks(nonfictionIterator);
    }

    private static void printBooks(Iterator<Book> iterator) {
        System.out.println("Books");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
