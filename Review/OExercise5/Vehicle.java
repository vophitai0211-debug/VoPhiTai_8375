package Review.OExercise5;

import java.util.Scanner;

public abstract class Vehicle implements IVehicle {
    private String id;
    private String vehicleName;
    private double price;
    private boolean isAvailable;

    public Vehicle() {
    }

    public Vehicle(String id, String vehicleName, double price, boolean isAvailable) {
        this.id = id;
        this.vehicleName = vehicleName;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public void addVehicleInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
        setId(scanner.nextLine());

        System.out.print("Enter vehicle name: ");
        setVehicleName(scanner.nextLine());

        System.out.print("Enter rental price per day: ");
        setPrice(scanner.nextDouble());

        System.out.print("Enter available (true/false): ");
        setAvailable(scanner.nextBoolean());
    }

    @Override
    public void updateVehicleInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle name: ");
        setVehicleName(scanner.nextLine());

        System.out.print("Enter rental price per day: ");
        setPrice(scanner.nextDouble());

        System.out.print("Enter available (true/false): ");
        setAvailable(scanner.nextBoolean());
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId()
                + "\nVehicle name: " + getVehicleName()
                + "\nPrice/day: " + getPrice()
                + "\nAvailable: " + isAvailable());
    }

    public abstract double calculateRentalCost();
}
