package Review.OExercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson {

    private String id;
    private String fullName;
    private Date dateOfBirth;
    private Date bookBrrowDate;
    private Date bookReturnDate;

    public Person() {
    }

    public Person(String id, String fullName, Date dateOfBirth, Date bookBrrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBrrowDate = bookBrrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public void setBookBrrowDate(Date bookBrrowDate) {
        this.bookBrrowDate = bookBrrowDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBookBrrowDate() {
        return bookBrrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public String getId() {
        return id;
    }

    public Boolean isBookOverdue() {
        if (bookReturnDate == null) {
            return false;
        }
        Date today = new Date();
        return today.after(bookReturnDate);
    }

    @Override
    public void addPerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            System.out.print("Enter id: ");
            setId(scanner.nextLine());
            System.out.print("Enter full name: ");
            setFullName(scanner.nextLine());
            System.out.print("Enter date of birth: ");
            setDateOfBirth(sdf.parse(scanner.nextLine()));
            System.out.print("Enter book borrow date: ");
            setBookBrrowDate(sdf.parse(scanner.nextLine()));
            System.out.print("Enter book return date: ");
            setBookReturnDate(sdf.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void updatePerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            System.out.print("Enter full name: ");
            setFullName(scanner.nextLine());
            System.out.print("Enter date of birth: ");
            setDateOfBirth(sdf.parse(scanner.nextLine()));
            System.out.print("Enter book borrow date: ");
            setBookBrrowDate(sdf.parse(scanner.nextLine()));
            System.out.print("Enter book return date: ");
            setBookReturnDate(sdf.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("id: " + getId()
                + "\nfull name: " + getFullName()
                + "\ndate of birth: " + getDateOfBirth()
                + "\nbook borrow date: " + getBookBrrowDate()
                + "\nbook return date: " + getBookReturnDate());
    }

}
