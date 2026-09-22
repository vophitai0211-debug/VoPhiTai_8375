package Review.OExercise2;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major, String id, String fullName, boolean isActive, Date dateOfBirth) {
        super(id, fullName, isActive, dateOfBirth);
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
    public void addPersonInfo() {
        super.addPersonInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gpa: ");
        setGpa(scanner.nextFloat());
        scanner.nextLine();
        System.out.print("Enter major: ");
        setMajor(scanner.nextLine());
    }

    @Override
    public void updatePersonInfo() {
        super.updatePersonInfo();
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
        System.out.println("Gpa: " + getGpa()
                + "\nMajor: " + getMajor());
    }

}
