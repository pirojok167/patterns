package Adapter;

public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasNextEnumeration();
    }

    @Override
    public Object next() {
        return enumeration.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
