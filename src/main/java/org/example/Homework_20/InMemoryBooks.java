package Homework_20;

import java.util.ArrayList;


public class InMemoryBooks {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author, int year) {
        try {

            int currentYear = 2024;
            if (year < 0 || year > currentYear) {
                throw new InvalidYearException("Не можливий рік видання");
            }

            Book newBook = new Book(title, author, year);
            for (Book book : books) {
                if (newBook.hashCode() == book.hashCode() && newBook.equals(book)) {
                    throw new DuplicateBookException("Ця книжка вже існує");
                }
            }

            books.add(newBook);
        } catch (DuplicateBookException | InvalidYearException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Сталася неочікувана помилка: " + e.getMessage());
        }
    }

    public void removeBook(String author, String title) {
        try {
            boolean isBookToDeleteFound = false;

            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                if (book.getAuthor().equals(author) && book.getTitle().equals(title)) {
                    books.remove(i);
                    isBookToDeleteFound = true;
                    break;
                }
            }

            if (!isBookToDeleteFound) {
                throw new BookNotFoundException("Книга яку ви хочете видалити не існує");
            }
        } catch (BookNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Сталася неочікувана помилка: " + e.getMessage());
        }
    }


    public Object[] findBooksByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {

            if (book.getAuthor().equals(author)) {
                result.add(book);
            }

        }
        return result.toArray();
    }

    public Object[] findBooksByYear(int year) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {

            if (book.getYear() == year) {
                result.add(book);
            }

        }
        return result.toArray();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}