package Review.OExercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    private ArrayList<Book> bookArrayList = new ArrayList<>();

    public void addBook(Book book) {
        bookArrayList.add(book);
    }

    public void updateBook(String id) {
        Book book = findBookById(id);
        if (book != null) {
            book.updateBook();
            System.out.println("Update book information completed!");
        } else {
            System.out.println("Error! Can't find book to Update");
        }
    }

    public void deleteBookById(String id) {
        Book book = findBookById(id);
        if (book != null) {
            bookArrayList.remove(book);
            System.out.println("Delete book information completed!");
        } else {
            System.out.println("Error! Can't find book to delete");
        }
    }

    public Book findBookById(String id) {
        for (Book book : bookArrayList) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void displayBookList() {
        for (Book book : bookArrayList) {
            book.displayBook();
        }
    }
}
