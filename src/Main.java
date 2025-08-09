

public class Main {

    public static void main(String[] args) {

        // Aggregation = Represents a 'has-a' relationship between objects.
        // One object contains another object as a part of its structure.
        // but the contained object/s can exist independently.

        Book book1 = new Book("The Fellowship of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1898, books);
        library.displayInfo();
    }

}