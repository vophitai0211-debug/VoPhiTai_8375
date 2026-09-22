package Review.OExercise3;

import java.util.Scanner;

public abstract class Product implements IProduct {

    private String id;
    private String productName;
    private double price;
    private boolean isAvailable;
    public Scanner scanner = new Scanner(System.in);

    public Product() {
    }

    public Product(String id, String productName, double price, boolean isAvailable) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public void addProductInfo() {
        System.out.print("Enter Product ID: ");
        this.id = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        this.productName = scanner.nextLine();
        System.out.print("Enter Price: ");
        this.price = Double.parseDouble(scanner.nextLine());
        System.out.print("Is Available (true/false): ");
        this.isAvailable = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void updateProductInfo() {
        System.out.print("Update Product Name: ");
        this.productName = scanner.nextLine();
        System.out.print("Update Price: ");
        this.price = Double.parseDouble(scanner.nextLine());
        System.out.print("Update Availability (true/false): ");
        this.isAvailable = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id
                + "\nName: " + productName
                + "\nPrice: $" + price
                + "\nAvailable: " + (isAvailable ? "Yes" : "No"));
    }
}
