package Homework_20;

import java.util.Arrays;

public class ProgramTest {

    public static void main(String[] args) {
        InMemoryBooks books = new InMemoryBooks();

        books.addBook("Harry Potter 1", "J Rowling", 1997);
        books.addBook("Harry Potter 2", "J Rowling", 1998);
        books.addBook("Parody of Harry Potter 2", "Not J Rowling", 1998);
        books.addBook("Harry Potter 3", "J Rowling", 1999);
        books.addBook("Random Book", "unknown", 2222);
        books.addBook("Ancient Book", "unknown", -5000);

        System.out.println(Arrays.toString(books.getBooks().toArray()));

        books.removeBook("J Rowling", "Harry Potter 3");
        books.removeBook("Some author", "some title");

        System.out.println(Arrays.toString(books.getBooks().toArray()));

        System.out.println(Arrays.toString(books.findBooksByAuthor("Some author")));
        System.out.println(Arrays.toString(books.findBooksByAuthor("J Rowling")));

        System.out.println(Arrays.toString(books.findBooksByYear(2000)));
        System.out.println(Arrays.toString(books.findBooksByYear(1998)));

    }
}
