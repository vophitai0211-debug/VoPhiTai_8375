package Review.OExercise4;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth, Date bookBrrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBrrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gpa: ");
        setGpa(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Enter major: ");
        setMajor(scanner.nextLine());
    }

    @Override
    public void updatePerson() {
        super.updatePerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gpa: ");
        setGpa(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Enter major: ");
        setMajor(scanner.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("gpa: " + getGpa()
                + "\nmajor: " + getMajor());
    }

}
