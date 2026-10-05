public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        library.add(new Book("Harry Potter", "J.K. Rowling", 1997));
        library.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        library.add(new Book("Atomic Habits", "James Clear", 2018));

        // Find a book that exists
        Book foundBook = library.findByTitle("Harry Potter");

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        }

        // Try to find a book that does not exist
        Book missingBook = library.findByTitle("Spider-Man");

        if (missingBook == null) {
            System.out.println("Book not found: Spider-Man");
        } else {
            System.out.println("Book found: " + missingBook);
        }

        // Remove one book
        boolean removed = library.remove("The Hobbit");
        System.out.println("The Hobbit removed: " + removed);

        // List the books that are left
        System.out.println("\nBooks left in the library:");
        library.listAll();
    }
}
