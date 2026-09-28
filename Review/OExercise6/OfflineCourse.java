package Review.OExercise6;

import java.util.Date;

public class OfflineCourse extends Course {

    private String classroomNumber;
    private double materialFeePerStudent;

    public OfflineCourse() {
    }

    public OfflineCourse(String classroomNumber, double materialFeePerStudent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        System.out.print("Enter classroom number: ");
        setClassroomNumber(scanner.nextLine());
        System.out.print("Enter material fee per student: ");
        setMaterialFeePerStudent(scanner.nextDouble());
        scanner.nextLine();
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        System.out.print("Enter classroom number: ");
        setClassroomNumber(scanner.nextLine());
        System.out.print("Enter material fee per student: ");
        setMaterialFeePerStudent(scanner.nextDouble());
        scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.print("Classroom number: " + getClassroomNumber()
                + "\nMaterial fee per student: " + getMaterialFeePerStudent());
    }

    @Override
    public double calculateTotalFee() {
        return (getFeePerStudent() + materialFeePerStudent) * getEnrolledStudents();
    }
}
