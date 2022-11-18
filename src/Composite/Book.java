package Composite;

public class Book extends Component {
    private final String name;
    private final int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected String getName() {
        return name;
    }

    protected int getPrice() {
        return price;
    }

    @Override
    protected void print() {
        System.out.println(getName() + " - " + getPrice() + "rub");
    }
}
