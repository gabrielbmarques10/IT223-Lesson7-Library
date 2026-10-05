public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public boolean isOldBook() {
        return year < 2000;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}
