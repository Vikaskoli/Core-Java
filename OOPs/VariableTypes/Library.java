package OOPs.VariableTypes;

class Book {
    // Instance variables
    private String title;
    private String author;
    private int yearPublished;

    // Static variable to keep track of the total number of books
    private static int totalBooks = 0;

    // Constructor to initialize instance variables
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        totalBooks++; // Increment the total number of books when a new book is added
    }

    // Method to display book details
    public void displayBookInfo() {
        // Local variables
        String bookInfo = "Title: " + title + ", Author: " + author + ", Year: " + yearPublished;
        System.out.println(bookInfo);
    }

    // Static method to display the total number of books
    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }
}

public class Library {
    public static void main(String[] args) {
        // Creating instances of Book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        // Displaying information about each book
        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();

        System.out.println("---------------------------");

        // Displaying the total number of books in the library
        Book.displayTotalBooks();
    }
}

