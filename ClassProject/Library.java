package ClassProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static void showLibrary(ArrayList<Book> books) {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    static Book addBook() {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a book title: ");
        String title = myObj.nextLine();

        System.out.print("Enter an author: ");
        String author = myObj.nextLine();

        System.out.print("Enter a book year: ");
        int year = myObj.nextInt();

        System.out.print("Enter a number of pages: ");
        int pages = myObj.nextInt();
        myObj.nextLine();

        Book newBook = new Book(title, author, year, pages);

        return newBook;
    }

    public static void main(String[] args) {

        Boolean temp = true;

        Scanner myObj = new Scanner(System.in);

        Book bellJar = new Book("The Bell Jar", "Sylvia Plath", 2023, 234);
        Book milkFed = new Book("Milk Fed", "Melissa Broder", 2025, 289);
        Book starvSaints = new Book("The Starving Saints", "Caitlin Starling", 2023, 344);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(bellJar);
        books.add(milkFed);
        books.add(starvSaints);

        do {

            System.out.println("To see all of your books in the library enter 1\nTo add a new book enter 2");
            switch (myObj.nextInt()) {
                case 1:
                    showLibrary(books);
                    break;
                case 2:
                    books.add(addBook());
                    break;
                default:
                    temp = false;
                    break;
            }

        } while (temp);

    }
}
