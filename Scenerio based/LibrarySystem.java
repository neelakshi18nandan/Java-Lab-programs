
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}


class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            // Case-insensitive search for a better user experience
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            System.out.println("\n--- Library Collection ---");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        myLibrary.addBook(new Book("1984", "George Orwell", "9780451524935"));
        myLibrary.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227"));

        myLibrary.displayAllBooks();

        String searchTitle = "1984";
        System.out.println("\nSearching for: " + searchTitle);
        Book foundBook = myLibrary.searchByTitle(searchTitle);

        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}