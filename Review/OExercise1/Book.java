package Review.OExercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook {

    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private int quantity;

    public Book() {
    }

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, int quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public void addBook() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter book id: ");
            setBookId(sc.nextLine());
            System.out.print("Enter publisher: ");
            setPublisher(sc.nextLine());
            System.out.print("Enter entry date (dd/MM/yyyy): ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            setEntryDate(sdf.parse(sc.nextLine()));
            System.out.print("Enter unit price: ");
            setUnitPrice(sc.nextDouble());
            System.out.print("Enter quantity: ");
            setQuantity(sc.nextInt());
            sc.nextLine();
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter publisher: ");
            setPublisher(scanner.nextLine());
            System.out.print("Enter entry date (dd/MM/yyyy): ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            setEntryDate(sdf.parse(scanner.nextLine()));
            System.out.print("Enter unit price: ");
            setUnitPrice(scanner.nextDouble());
            System.out.print("Enter quantity: ");
            setQuantity(scanner.nextInt());
            scanner.nextLine();
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void displayBook() {
        System.out.println("Book id: " + getBookId()
                + "\nPublisher: " + getPublisher()
                + "\nEntry date: " + getEntryDate()
                + "\nUnit price: " + getUnitPrice()
                + "\nQuantity: " + getQuantity());
    }

}