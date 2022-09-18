package ClassesObjects.task12.Entity.Comparator;

import java.util.Comparator;

import ClassesObjects.task12.Entity.Book;

public class TitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        TitleComparator comparator = new TitleComparator();
        int titleCompare = comparator.compare(o1, o2);
        if (titleCompare != 0) return titleCompare;
        else return o1.getAuthor().compareTo(o2.getAuthor());
    }
}