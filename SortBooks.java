import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import ClassProject.Book;

public class SortBooks {

    public static List<Book> sortByYear(List<Book> books) {

        Comparator<Book> bookYearComparator = Comparator.comparing(Book::getYear);

        books.sort(bookYearComparator);

        return books;

    }

    public static List<Book> sortByPageCount(List<Book> books) {

        Comparator<Book> bookPagesComparator = Comparator.comparing(Book::getPages);

        books.sort(bookPagesComparator);

        return books;

    }

    public static List<Book> sortByTitle(List<Book> books) {

        Comparator<Book> bookTitleComparator = Comparator.comparing(Book::getTitle);

        books.sort(bookTitleComparator);

        return books;
    }

    static void showLibrary(List<Book> books) {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public static void main(String[] args) {
        Book bellJar = new Book("The Bell Jar", "Sylvia Plath", 2023, 234);
        Book milkFed = new Book("Milk Fed", "Melissa Broder", 2025, 289);
        Book starvSaints = new Book("The Starving Saints", "Caitlin Starling", 2021, 344);

        List<Book> books = new ArrayList<Book>();

        books.add(milkFed);
        books.add(bellJar);
        books.add(starvSaints);

        System.out.println("All the books: ");
        showLibrary(books);

        books = sortByYear(books);
        System.out.println("\nSorted by year: ");
        showLibrary(books);

        books = sortByPageCount(books);
        System.out.println("\nSorted by page count: ");
        showLibrary(books);

        books = sortByTitle(books);
        System.out.println("\nSorted by title: ");
        showLibrary(books);

    }

}
