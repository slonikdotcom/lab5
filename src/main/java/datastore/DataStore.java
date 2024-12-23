package datastore;

import model.Book;

public interface DataStore {
    void addBook(Book book);
    Iterable<Book> getBooks();
}
