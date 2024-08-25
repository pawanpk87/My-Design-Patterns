package IteratorCode;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    @Override
    public BookIterator createIterator() {
        return new LibraryBookIterator(books);
    }
}