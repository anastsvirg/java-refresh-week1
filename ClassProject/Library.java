package ClassProject;

import java.util.HashMap;
import java.util.Scanner;

public class Library {

    private HashMap<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public Library(HashMap<String, Book> books) {
        this.books = books;
    }

    public void showLibrary() {
        HashMap<String, Book> books = getLibrary();
        for (Book book : books.values()) {
            book.displayInfo();
        }
    }

    public void addBook(Book book) {
        books.put(
                book.getTitle().toLowerCase(),
                book);
    }

    public HashMap<String, Book> getLibrary() {
        return this.books;
    }

    public Book findBook(String title) {

        HashMap<String, Book> books = getLibrary();
        return books.get(title.toLowerCase());

    }
}
