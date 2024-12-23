package catalog;

import catalog.Catalog;
import model.Book;
import datastore.DataStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryCatalog implements Catalog {
    private DataStore dataStore;

    public LibraryCatalog(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void addBook(Book book) {
        dataStore.addBook(book);
    }

    @Override
    public Iterator<Book> getIteratorByGenre(String genre) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : dataStore.getBooks()) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks.iterator();
    }
}
