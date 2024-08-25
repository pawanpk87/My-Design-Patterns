package IteratorCode;

import java.util.List;

public class LibraryBookIterator implements BookIterator {
    private List<Book> books;
    private int position = 0;

    public LibraryBookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hashNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        if (!hashNext()) {
            throw new IndexOutOfBoundsException("No more books in the library");
        }
        return books.get(position++);
    }
}