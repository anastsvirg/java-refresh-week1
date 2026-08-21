package ClassProject;

import java.time.Year;
import java.util.HashMap;
import java.util.Scanner;

public class Library {

    static Scanner myObj = new Scanner(System.in);

    static void showLibrary(HashMap<String, Book> books) {
        for (Book book : books.values()) {
            book.displayInfo();
        }
    }

    static Book addBook() {

        System.out.print("Enter a book title: ");
        String title = myObj.nextLine();

        System.out.print("Enter an author: ");
        String author = myObj.nextLine();

        System.out.print("Enter a book year: ");
        int year;
        do {
            try {
                year = myObj.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a numeric value!");
                continue;
            }

            if (year < 0 || year > Year.now().getValue()) {
                throw new ArithmeticException("Invalid year");
            }

            break;

        } while (true);

        System.out.print("Enter a number of pages: ");
        int pages;
        do {
            try {
                pages = myObj.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a numeric value!");
                continue;
            }

            if (pages < 1 || pages > 1000) {
                throw new ArithmeticException("Invalid number of pages");
            }

            break;

        } while (true);
        myObj.nextLine();

        Book newBook = new Book(title, author, year, pages);

        return newBook;
    }

    static void findBook(HashMap<String, Book> books) {
        System.out.print("Enter a title: ");
        String title = myObj.nextLine();
        Book book = books.get(title.toLowerCase());

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        book.displayInfo();
    }

    public static void main(String[] args) {

        boolean isRunning = true;

        Book bellJar = new Book("The Bell Jar", "Sylvia Plath", 2023, 234);
        Book milkFed = new Book("Milk Fed", "Melissa Broder", 2025, 289);
        Book starvSaints = new Book("The Starving Saints", "Caitlin Starling", 2023, 344);

        HashMap<String, Book> books = new HashMap<String, Book>();
        books.put(bellJar.getTitle().toLowerCase(), bellJar);
        books.put(milkFed.getTitle().toLowerCase(), milkFed);
        books.put(starvSaints.getTitle().toLowerCase(), starvSaints);

        do {

            System.out.println(
                    "To see all of your books in the library enter 1\nTo add a new book enter 2\nTo search by title enter 3\nTo exit enter 4");
            switch (myObj.nextLine()) {
                case "1":
                    showLibrary(books);
                    break;
                case "2":
                    Book newBook = addBook();

                    books.put(
                            newBook.getTitle().toLowerCase(),
                            newBook);
                    break;
                case "3":
                    findBook(books);
                    break;
                default:
                    isRunning = false;
                    break;
            }

        } while (isRunning);

    }
}
