package ClassesObjects.task12.Entity;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    static {
        edition = 1;
    }

    public Book(String title, String author, int price) {
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return price * title.hashCode() + edition * author.hashCode() + 0b1001011001110110011;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book))
            return false;
        Book book = (Book) obj;
        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public String toString() {
        return String.format("Book with Title: %s; Author: %s; Price: %d; Edition: %d;", title, author, price, edition);
    }

    // For task 13
    @Override
    public Book clone() {
        return new Book(this.title, this.author, this.price);
    }

    // For task 14
    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public int getISBN() {
        return isbn;
    }

    @Override
    public int compareTo(Book obj) {
        return this.isbn - obj.getISBN();
    }

    // For task 15
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}