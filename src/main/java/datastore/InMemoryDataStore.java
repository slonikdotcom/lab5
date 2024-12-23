package datastore;

import model.Book;
import java.util.ArrayList;
import java.util.List;

public class InMemoryDataStore implements DataStore {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterable<Book> getBooks() {
        return books;
    }
}