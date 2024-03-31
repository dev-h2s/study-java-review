package extend1.ex;

public class Book extends Item {
    String author;
    String isbn;

    @Override
    public void print() {
        super.print();
        System.out.println("-저자:"+author+"isbn"+isbn);
    }

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
}
