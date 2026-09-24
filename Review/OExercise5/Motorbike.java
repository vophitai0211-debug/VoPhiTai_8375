package Review.OExercise5;

import java.util.Scanner;

public class Motorbike extends Vehicle {
    private int engineCapacity;
    private double discountPercent;
    private int rentalDays;

    public Motorbike() {
    }

    public Motorbike(int engineCapacity, double discountPercent, int rentalDays,
                     String id, String vehicleName, double price, boolean isAvailable) {
        super(id, vehicleName, price, isAvailable);
        this.engineCapacity = engineCapacity;
        this.discountPercent = discountPercent;
        this.rentalDays = rentalDays;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    @Override
    public void addVehicleInfo() {
        super.addVehicleInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter engine capacity: ");
        setEngineCapacity(scanner.nextInt());

        System.out.print("Enter discount percent: ");
        setDiscountPercent(scanner.nextDouble());

        System.out.print("Enter rental days: ");
        setRentalDays(scanner.nextInt());
    }

    @Override
    public void updateVehicleInfo() {
        super.updateVehicleInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter engine capacity: ");
        setEngineCapacity(scanner.nextInt());

        System.out.print("Enter discount percent: ");
        setDiscountPercent(scanner.nextDouble());

        System.out.print("Enter rental days: ");
        setRentalDays(scanner.nextInt());
    }

    @Override
    public double calculateRentalCost() {
        return getPrice() * rentalDays * (1 - discountPercent / 100);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine capacity: " + getEngineCapacity()
                + "\nDiscount percent: " + getDiscountPercent()
                + "\nRental days: " + getRentalDays()
                + "\nRental cost: " + calculateRentalCost());
    }
}
