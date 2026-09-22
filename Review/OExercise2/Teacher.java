package Review.OExercise2;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject, String id, String fullName, boolean isActive, Date dateOfBirth) {
        super(id, fullName, isActive, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPersonInfo() {
        super.addPersonInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department: ");
        setDepartment(scanner.nextLine());
        System.out.print("Enter teaching subject: ");
        setTeachingSubject(scanner.nextLine());
    }

    @Override
    public void updatePersonInfo() {
        super.updatePersonInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department: ");
        setDepartment(scanner.nextLine());
        System.out.print("Enter teaching subject: ");
        setTeachingSubject(scanner.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + getDepartment()
                + "\nTeaching subject: " + getTeachingSubject());
    }
}
