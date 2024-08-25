package IteratorCode;

public class Client {
    public static void main(String[] args) {
        Library library = new Library();

        library.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925));
        library.add(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", 1960));
        library.add(new Book("1984", "George Orwell", "9780451524935", 1949));

        BookIterator iterator = library.createIterator();

        while (iterator.hashNext()) {
            System.out.println(iterator.next());
        }
    }
}