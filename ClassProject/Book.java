package ClassProject;

public class Book {

    String title;
    String author;
    int year;
    int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    void displayInfo() {
        System.out.print("\"" + this.title + "\" " + this.author + this.year + ", ");
        isLongBook();
    }

    void isLongBook() {
        System.out.println(this.pages + " pages");
    }

}
