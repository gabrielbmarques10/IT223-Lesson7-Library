import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void add(Book b) {
        books.add(b);
    }

    public boolean remove(String title) {
        Book book = findByTitle(title);

        if (book != null) {
            books.remove(book);
            return true;
        }

        return false;
    }

    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    public void listAll() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
