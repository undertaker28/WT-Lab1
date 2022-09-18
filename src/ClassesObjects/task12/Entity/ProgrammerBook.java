package ClassesObjects.task12.Entity;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ProgrammerBook))
            return false;
        Book book = (Book) obj;
        if (!book.equals(this))
            return false;
        ProgrammerBook prgBook = (ProgrammerBook) book;
        return level == prgBook.level && this.language.equals(prgBook.language);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode() ^ level;
    }

    @Override
    public String toString() {
        return String.format("%s Language: %s; Level: %d", super.toString(), language, level);
    }
}