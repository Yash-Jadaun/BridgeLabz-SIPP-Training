package OOPS.Object_Oriented_Design_Priciples;

import java.util.ArrayList;

// Book class - Independent Entity
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class - Aggregates books
class Library {
    String name;
    ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("\nBooks in " + name + " Library:");
        for (Book book : books) {
            book.displayBook();
        }
    }
}

// Main class to demonstrate Aggregation
public class LiberaryandBooks {
    public static void main(String[] args) {

        // Creating independent Book objects
        Book b1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");
        Book b2 = new Book("Clean Code", "Robert C. Martin");
        Book b3 = new Book("Atomic Habits", "James Clear");

        // Creating libraries
        Library lib1 = new Library("City Central");
        Library lib2 = new Library("College Library");

        // Adding books to libraries (Aggregation)
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);  // same book in another library
        lib2.addBook(b3);

        // Display books in each library
        lib1.showBooks();
        lib2.showBooks();
    }
}
