package OOPS.Inheritance;

// Superclass
class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Published Year: " + publicationYear);
    }
}


class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); 
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // call Book's displayInfo
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}


public class LiberaryManagement {
    public static void main(String[] args) {
        Author a1 = new Author("Wings of Fire", 1999, "Dr. A.P.J. Abdul Kalam", "Former President of India and a great scientist");
        a1.displayInfo();
    }
}
