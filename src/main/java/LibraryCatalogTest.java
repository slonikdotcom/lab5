import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryCatalogTest {
    @Test
    void testAddBook() {
        // Тест перевіряє базове додавання книги
        DataStore dataStore = new InMemoryDataStore();
        Catalog catalog = new LibraryCatalog(dataStore);

        catalog.addBook(new Book("Clean Code", "Robert C. Martin", "Programming", 2008));

        // Перевірка успішного збереження
        Iterator<Book> iterator = catalog.getIteratorByGenre("Programming");
        assertTrue(iterator.hasNext());
        Book book = iterator.next();
        assertEquals("Clean Code", book.getTitle());
        assertEquals("Robert C. Martin", book.getAuthor());
    }
}
