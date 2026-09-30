package Review.OExercise7;

import java.util.Date;
import java.util.Scanner;

public class Smartphone extends Product {

    private int storageGB;
    private double taxPercent;

    public Smartphone() {
        super();
    }

    public Smartphone(String id, double basePrice, Date importDate, boolean isAvailable, int quantity,
            int storageGB, double taxPercent) {
        super(id, basePrice, importDate, isAvailable, quantity);
        this.storageGB = storageGB;
        this.taxPercent = taxPercent;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    @Override
    public void addProduct() {
        super.addProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dung luong bo nho (GB): ");
        this.storageGB = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap phan tram thue (taxPercent): ");
        this.taxPercent = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void updateProduct() {
        super.updateProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dung luong bo nho moi (GB): ");
        this.storageGB = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap phan tram thue moi: ");
        this.taxPercent = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("-> [Smartphone] Bo nho: " + storageGB + "GB | Thue: " + taxPercent
                + "% | Gia ban cuoi cung: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        double storageFee;
        if (storageGB >= 512) {
            storageFee = getBasePrice() * 0.15;
        } else if (storageGB >= 256) {
            storageFee = getBasePrice() * 0.10;
        } else {
            storageFee = getBasePrice() * 0.05;
        }
        return (getBasePrice() + storageFee) * (1 + taxPercent / 100);
    }
}
