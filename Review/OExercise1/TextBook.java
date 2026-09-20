package Review.OExercise1;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    private String status;
    
    public TextBook() {
    }
    
    public TextBook(String status, String bookId, String publisher, Date entryDate, double unitPrice, int quantity) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }
    
    public TextBook(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text book status(new/old): ");
        setStatus(scanner.nextLine());
        System.out.println();
    }

    @Override
    public void updateBook() {
        super.updateBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Update text book status(new/old): ");
        setStatus(scanner.nextLine());
    }
    
    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Text book status: " + getStatus() + "\n");
    }
}
