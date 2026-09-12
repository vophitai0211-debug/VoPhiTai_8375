package Lec11_Encapsulation.CarProfileClass;

import java.util.Scanner;

public class CarProfile {

    private String make;
    private String model;
    private int year;

    public CarProfile() {
    }

    public CarProfile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter make: ");
        setMake(scanner.nextLine());
        System.out.print("Enter model: ");
        setModel(scanner.nextLine());
        System.out.print("Enter year: ");
        setYear(scanner.nextInt());
    }

    public void displayProfile() {
        System.out.println("Make: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear());
    }
}
