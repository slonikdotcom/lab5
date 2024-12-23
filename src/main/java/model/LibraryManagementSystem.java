package model;

import catalog.Catalog;
import catalog.LibraryCatalog;
import datastore.DataStore;
import datastore.InMemoryDataStore;
import model.Book;

import java.util.Iterator;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        DataStore dataStore = new InMemoryDataStore();
        Catalog catalog = new LibraryCatalog(dataStore);

        catalog.addBook(new Book("Clean Code", "Robert C. Martin", "Programming", 2008));
        catalog.addBook(new Book("Effective Java", "Joshua Bloch", "Programming", 2017));
        catalog.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937));

        Iterator<Book> genreIterator = catalog.getIteratorByGenre("Programming");
        while (genreIterator.hasNext()) {
            System.out.println(genreIterator.next());
        }
    }
}