package Review.IndividualProject;

import java.util.Date;
import java.util.Scanner;

public class Laptop extends Device {

    private int ramGb;
    private String processor;
    private boolean isTouchscreen;

    public Laptop() {
    }

    public Laptop(int ramGb, String processor, boolean isTouchscreen, String deviceId, String name, double originalPrice, boolean isAvailable, Date importDate, int warrantyMonths) {
        super(deviceId, name, originalPrice, isAvailable, importDate, warrantyMonths);
        this.ramGb = ramGb;
        this.processor = processor;
        this.isTouchscreen = isTouchscreen;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public boolean isTouchscreen() {
        return isTouchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        isTouchscreen = touchscreen;
    }

    @Override
    public void addDeviceInfo() {
        super.addDeviceInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter RAM capacity: ");
        setRamGb(Integer.parseInt(scanner.nextLine().trim()));
        System.out.print("Enter Processor: ");
        setProcessor(scanner.nextLine().trim());
        System.out.print("Is touchscreen (true/false): ");
        setTouchscreen(Boolean.parseBoolean(scanner.nextLine().trim()));
    }

    @Override
    public void updateDeviceInfo() {
        super.updateDeviceInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new RAM capacity: ");
        setRamGb(Integer.parseInt(scanner.nextLine().trim()));
        System.out.print("Enter new Processor: ");
        setProcessor(scanner.nextLine().trim());
        System.out.print("Is touchscreen (true/false): ");
        setTouchscreen(Boolean.parseBoolean(scanner.nextLine().trim()));
    }

    @Override
    public void displayDeviceInfo() {
        super.displayDeviceInfo();
        System.out.println("Type: Laptop"
                + "\nRAM: " + getRamGb() + " GB"
                + "\nCPU: " + getProcessor()
                + "\nTouchscreen: " + (isTouchscreen() ? "Yes" : "No"));
    }

    @Override
    public double calculateCurrentValue() {
        if (getImportDate() == null) return getOriginalPrice();
        long years = (new Date().getTime() - getImportDate().getTime()) / (1000L * 60 * 60 * 24 * 365);
        double depreciated = getOriginalPrice() * Math.pow(0.85, Math.max(0, years));
        return Math.max(depreciated, getOriginalPrice() * 0.2);
    }
}