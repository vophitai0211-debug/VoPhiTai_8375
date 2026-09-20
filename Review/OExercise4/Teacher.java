package Review.OExercise4;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {
    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth, Date bookBrrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBrrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    @Override
    public void addPerson() {
        super.addPerson();
        System.out.print("Enter department: ");
        setDepartment(scanner.nextLine());
        System.out.print("Enter teaching subject: ");
        setTeachingSubject(scanner.nextLine());
    }

    @Override
    public void updatePerson() {
        super.updatePerson();
        System.out.print("Enter department: ");
        setDepartment(scanner.nextLine());
        System.out.print("Enter teaching subject: ");
        setTeachingSubject(scanner.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("department: " + getDepartment()
                + "\nteaching subject: " + getTeachingSubject());
    }
}
