package Review.OExercise9;

import java.util.Date;
import java.util.Scanner;

public class StorageService extends CloudService {

    private int storageGB;
    private boolean encryptionEnabled;

    public StorageService() {
    }

    public StorageService(int storageGB, boolean encryptionEnabled, String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.storageGB = storageGB;
        this.encryptionEnabled = encryptionEnabled;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public boolean isEncryptionEnabled() {
        return encryptionEnabled;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public void setEncryptionEnabled(boolean encryptionEnabled) {
        this.encryptionEnabled = encryptionEnabled;
    }

    public static void setScanner(Scanner scanner) {
        CloudService.scanner = scanner;
    }

    @Override
    public void addService() {
        super.addService();
        System.out.print("Enter storage GB: ");
        setStorageGB(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter encryption enabled: ");
        setEncryptionEnabled(Boolean.parseBoolean(scanner.nextLine()));
    }

    @Override
    public void updateService() {
        super.updateService();
        System.out.print("Enter storage GB: ");
        setStorageGB(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Enter encryption enabled: ");
        setEncryptionEnabled(Boolean.parseBoolean(scanner.nextLine()));
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Storage GB: " + getStorageGB()
                + "\nEncryption enabled: " + (encryptionEnabled ? "Yes" : "No"));
    }

    @Override
    public double calculateMonthlyCost() {
        double baseCost = getBaseMonthlyFee() * getMonthsUsed();
        double surcharge = 0;
        if (storageGB >= 1000) {
            surcharge += baseCost * 0.20;
        } else if (storageGB >= 500) {
            surcharge += baseCost * 0.10;
        } else {
            surcharge += baseCost * 0.05;
        }
        if (encryptionEnabled) {
            surcharge += baseCost * 0.05;
        }
        return baseCost + surcharge;
    }

}
