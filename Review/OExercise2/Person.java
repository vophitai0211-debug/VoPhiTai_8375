package Review.OExercise2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson {

    private String id;
    private String fullName;
    private boolean isActive;
    private Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String fullName, boolean isActive, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.isActive = isActive;
        this.dateOfBirth = dateOfBirth;
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

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public void addPersonInfo() {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter id: ");
            setId(scanner.nextLine());
            System.out.print("Enter full name: ");
            setFullName(scanner.nextLine());
            System.out.print("Enter date of birth: ");
            setDateOfBirth(sdf.parse(scanner.nextLine()));
            System.out.println("Enter active (true/false): ");
            setIsActive(Boolean.parseBoolean(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void updatePersonInfo() {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter full name: ");
            setFullName(scanner.nextLine());
            System.out.print("Enter date of birth: ");
            setDateOfBirth(sdf.parse(scanner.nextLine()));
            System.out.println("Enter active (true/false): ");
            setIsActive(Boolean.parseBoolean(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dob = (dateOfBirth != null) ? sdf.format(dateOfBirth) : "N/A";
        System.out.println("ID: " + getId()
                + "\nFull name: " + getFullName()
                + "\nDate of birth: " + dob
                + "\nActive: " + isActive);
    }

}
