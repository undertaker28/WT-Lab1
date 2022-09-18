package ClassesObjects.task12.Entity.Comparator;

import java.util.Comparator;

import ClassesObjects.task12.Entity.Book;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        AuthorTitleComparator comparator = new AuthorTitleComparator();
        int authorTitleCompare = comparator.compare(o1, o2);
        if (authorTitleCompare != 0) return authorTitleCompare;
        else return o1.getPrice() - o2.getPrice();
    }
}