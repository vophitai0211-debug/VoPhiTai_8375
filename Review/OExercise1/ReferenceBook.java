package Review.OExercise1;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book{
    private double tax;

    public ReferenceBook() {
    }

    public ReferenceBook(double tax, String bookId, String publisher, Date entryDate, double unitPrice, int quantity) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public ReferenceBook(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter reference book tax: ");
        setTax(scanner.nextDouble());
        System.out.println();
    }
    @Override
    public void updateBook(){
        super.updateBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Update reference book tax: ");
        setTax(scanner.nextDouble());
    }

    @Override
    public void displayBook(){
        super.displayBook();
        System.out.println("Reference book tax: " + getTax() + "\n");
    }
}

