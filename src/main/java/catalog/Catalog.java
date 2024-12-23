package catalog;

import model.Book;
import java.util.Iterator;

public interface Catalog {
    void addBook(Book book);
    Iterator<Book> getIteratorByGenre(String genre);
}