package ClassesObjects.task12.Entity.Comparator;

import java.util.Comparator;

import ClassesObjects.task12.Entity.Book;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}