package Review.OExercise7;

import java.util.Date;
import java.util.Scanner;

public class Laptop extends Product {

    private int warrantyYears;
    private double discountPercent;

    public Laptop() {
        super();
    }

    public Laptop(String id, double basePrice, Date importDate, boolean isAvailable, int quantity,
            int warrantyYears, double discountPercent) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.warrantyYears = warrantyYears;
        this.discountPercent = discountPercent;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addProduct() {
        super.addProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh (nam): ");
        this.warrantyYears = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap phan tram giam gia (discountPercent): ");
        this.discountPercent = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void updateProduct() {
        super.updateProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh moi (nam): ");
        this.warrantyYears = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap phan tram giam gia moi: ");
        this.discountPercent = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("-> [Laptop] Bao hanh: " + warrantyYears + " nam | Giam gia: " + discountPercent
                + "% | Gia ban cuoi cung: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        double warrantyFee;
        if (warrantyYears >= 3) {
            warrantyFee = getBasePrice() * 0.08;
        } else {
            warrantyFee = getBasePrice() * 0.03;
        }
        return (getBasePrice() + warrantyFee) * (1 - discountPercent / 100);
    }
}
