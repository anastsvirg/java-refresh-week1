package ClassProject;

public class Book {

    private String title;
    private String author;
    private int year;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    void displayInfo() {
        System.out.printf(
                "\"%s\" by %s (%d), %d pages, long book: %s%n",
                getTitle(),
                getAuthor(),
                getYear(),
                getPages(),
                isLongBook());
    }

    public boolean isLongBook() {
        return pages >= 300;
    }

}
