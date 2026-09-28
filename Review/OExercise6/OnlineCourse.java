package Review.OExercise6;

import java.util.Date;

public class OnlineCourse extends Course {

    private String platformName;
    private double discountPercent;

    public OnlineCourse() {
    }

    public OnlineCourse(String flatformName, double discountPercent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.platformName = flatformName;
        this.discountPercent = discountPercent;
    }

    public String getPlatformName() {
        return platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setPlatformName(String flatformName) {
        this.platformName = flatformName;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        System.out.print("Enter platform name: ");
        setPlatformName(scanner.nextLine());
        System.out.print("Enter discount percent: ");
        setDiscountPercent(scanner.nextDouble());
        scanner.nextLine();
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        System.out.print("Enter platform name: ");
        setPlatformName(scanner.nextLine());
        System.out.print("Enter discount percent: ");
        setDiscountPercent(scanner.nextDouble());
        scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.print("Platform name: " + getPlatformName()
                + "\nDiscount percent: " + getDiscountPercent());
    }

    @Override
    public double calculateTotalFee() {
        return getFeePerStudent() * getEnrolledStudents() * (1 - getDiscountPercent() / 100);
    }

}
