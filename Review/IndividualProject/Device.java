package Review.IndividualProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Device implements IDevice {

    private String deviceId;
    private String name;
    private double originalPrice;
    private boolean isAvailable;
    private Date importDate;
    private int warrantyMonths;

    public Device() {
    }

    public Device(String deviceId, String name, double originalPrice, boolean isAvailable, Date importDate, int warrantyMonths) {
        this.deviceId = deviceId;
        this.name = name;
        this.originalPrice = originalPrice;
        this.isAvailable = isAvailable;
        this.importDate = importDate;
        this.warrantyMonths = warrantyMonths;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void addDeviceInfo() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Enter device ID: ");
            setDeviceId(scanner.nextLine().trim());
            System.out.print("Enter device name: ");
            setName(scanner.nextLine().trim());
            System.out.print("Enter original price ($): ");
            setOriginalPrice(Double.parseDouble(scanner.nextLine().trim()));
            System.out.print("Enter import date (dd/MM/yyyy): ");
            setImportDate(sdf.parse(scanner.nextLine().trim()));
            System.out.print("Enter warranty duration (months): ");
            setWarrantyMonths(Integer.parseInt(scanner.nextLine().trim()));
            System.out.print("Is available in stock (true/false): ");
            setAvailable(Boolean.parseBoolean(scanner.nextLine().trim()));
        } catch (ParseException e) {
            System.out.println("Invalid date format! Defaulting to current date.");
            setImportDate(new Date());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format! Setting default numbers.");
            setOriginalPrice(0.0);
            setWarrantyMonths(12);
        }
    }

    @Override
    public void updateDeviceInfo() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Enter new name: ");
            setName(scanner.nextLine().trim());
            System.out.print("Enter new price ($): ");
            setOriginalPrice(Double.parseDouble(scanner.nextLine().trim()));
            System.out.print("Enter new import date (dd/MM/yyyy): ");
            setImportDate(sdf.parse(scanner.nextLine().trim()));
            System.out.print("Enter new warranty duration (months): ");
            setWarrantyMonths(Integer.parseInt(scanner.nextLine().trim()));
            System.out.print("Is available (true/false): ");
            setAvailable(Boolean.parseBoolean(scanner.nextLine().trim()));
        } catch (ParseException e) {
            System.out.println("Invalid date format! Skipping date update.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input! Skipping numeric update.");
        }
    }

    @Override
    public void displayDeviceInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = (importDate != null) ? sdf.format(importDate) : "N/A";
        System.out.println("----------------------------------------------");
        System.out.println("Device ID: " + getDeviceId()
                + "\nName: " + getName()
                + "\nOriginal Price: $" + getOriginalPrice()
                + "\nImport Date: " + dateStr
                + "\nWarranty (Months): " + getWarrantyMonths()
                + "\nAvailable: " + isAvailable()
                + "\nUnder Warranty: " + (isUnderWarranty() ? "YES" : "NO")
                + String.format("\nEstimated Current Value: $%.2f", calculateCurrentValue()));
    }

    @Override
    public boolean isUnderWarranty() {
        if (importDate == null) return false;
        long elapsedMillis = new Date().getTime() - importDate.getTime();
        long warrantyMillis = (long) warrantyMonths * 30L * 24L * 60L * 60L * 1000L;
        return elapsedMillis <= warrantyMillis;
    }
}