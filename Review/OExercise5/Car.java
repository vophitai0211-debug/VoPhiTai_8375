package Review.OExercise5;

import java.util.Scanner;

public class Car extends Vehicle {
    private int numberOfSeats;
    private double insuranceFee;
    private int rentalDays;

    public Car() {
    }

    public Car(int numberOfSeats, double insuranceFee, int rentalDays,
               String id, String vehicleName, double price, boolean isAvailable) {
        super(id, vehicleName, price, isAvailable);
        this.numberOfSeats = numberOfSeats;
        this.insuranceFee = insuranceFee;
        this.rentalDays = rentalDays;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    @Override
    public void addVehicleInfo() {
        super.addVehicleInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        setNumberOfSeats(scanner.nextInt());

        System.out.print("Enter insurance fee: ");
        setInsuranceFee(scanner.nextDouble());

        System.out.print("Enter rental days: ");
        setRentalDays(scanner.nextInt());
    }

    @Override
    public void updateVehicleInfo() {
        super.updateVehicleInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        setNumberOfSeats(scanner.nextInt());

        System.out.print("Enter insurance fee: ");
        setInsuranceFee(scanner.nextDouble());

        System.out.print("Enter rental days: ");
        setRentalDays(scanner.nextInt());
    }

    @Override
    public double calculateRentalCost() {
        return getPrice() * rentalDays + insuranceFee * rentalDays;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of seats: " + getNumberOfSeats()
                + "\nInsurance fee: " + getInsuranceFee()
                + "\nRental days: " + getRentalDays()
                + "\nRental cost: " + calculateRentalCost());
    }
}
