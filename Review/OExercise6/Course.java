package Review.OExercise6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Course implements ICourse {

    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrolledStudents;
    public static Scanner scanner = new Scanner(System.in);

    public Course() {
    }

    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }

    public String getId() {
        return id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void addCourse() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter id: ");
            setId(scanner.nextLine());
            System.out.print("Enter fee per student: ");
            setFeePerStudent(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("Enter start date: ");
            setStartDate(sdf.parse(scanner.nextLine()));
            System.out.print("Enter is available(true/false): ");
            setIsAvailable(Boolean.parseBoolean(scanner.nextLine()));
            System.out.print("Enter enrolled students: ");
            setEnrolledStudents(scanner.nextInt());
            scanner.nextLine();
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void updateCourse() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter fee per student: ");
            setFeePerStudent(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("Enter start date: ");
            setStartDate(sdf.parse(scanner.nextLine()));
            System.out.print("Enter is available(true/false): ");
            setIsAvailable(Boolean.parseBoolean(scanner.nextLine()));
            System.out.print("Enter enrolled students: ");
            setEnrolledStudents(scanner.nextInt());
            scanner.nextLine();
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Id: " + getId()
                + "\nFee per student: " + getFeePerStudent()
                + "\nStart date: " + getStartDate()
                + "\nIs available: " + (isAvailable ? "Yes" : "No")
                + "\nEnrolled students: " + getEnrolledStudents());
    }
}
