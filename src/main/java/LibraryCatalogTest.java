import catalog.Catalog;
import catalog.LibraryCatalog;
import datastore.DataStore;
import datastore.InMemoryDataStore;
import model.Book;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class LibraryCatalogTest {
    @Test
    void testAddBookAndIterateByGenre() {
        
        DataStore dataStore = new InMemoryDataStore();
        Catalog catalog = new LibraryCatalog(dataStore);

        catalog.addBook(new Book("Book 1", "Author A", "Genre X", 2000));
        catalog.addBook(new Book("Book 2", "Author B", "Genre Y", 2001));
        catalog.addBook(new Book("Book 3", "Author A", "Genre X", 2002));

        Iterator<Book> iterator = catalog.getIteratorByGenre("Genre X");
        assertTrue(iterator.hasNext());
        assertEquals("Book 1", iterator.next().getTitle());
        assertEquals("Book 3", iterator.next().getTitle());
        assertFalse(iterator.hasNext());
    }
}