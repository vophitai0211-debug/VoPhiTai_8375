package Review.IndividualProject;

import java.util.Date;
import java.util.Scanner;

public class SmartPhone extends Device {

    private int batteryCapacity;
    private int cameraResolution;
    private boolean has5GSupport;

    public SmartPhone() {
    }

    public SmartPhone(int batteryCapacity, int cameraResolution, boolean has5GSupport, String deviceId, String name, double originalPrice, boolean isAvailable, Date importDate, int warrantyMonths) {
        super(deviceId, name, originalPrice, isAvailable, importDate, warrantyMonths);
        this.batteryCapacity = batteryCapacity;
        this.cameraResolution = cameraResolution;
        this.has5GSupport = has5GSupport;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public boolean isHas5GSupport() {
        return has5GSupport;
    }

    public void setHas5GSupport(boolean has5GSupport) {
        this.has5GSupport = has5GSupport;
    }

    @Override
    public void addDeviceInfo() {
        super.addDeviceInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter battery capacity (mAh): ");
        setBatteryCapacity(Integer.parseInt(scanner.nextLine().trim()));
        System.out.print("Enter main camera resolution (MP): ");
        setCameraResolution(Integer.parseInt(scanner.nextLine().trim()));
        System.out.print("Supports 5G (true/false): ");
        setHas5GSupport(Boolean.parseBoolean(scanner.nextLine().trim()));
    }

    @Override
    public void updateDeviceInfo() {
        super.updateDeviceInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new battery capacity (mAh): ");
        setBatteryCapacity(Integer.parseInt(scanner.nextLine().trim()));
        System.out.print("Enter new camera resolution (MP): ");
        setCameraResolution(Integer.parseInt(scanner.nextLine().trim()));
        System.out.print("Supports 5G (true/false): ");
        setHas5GSupport(Boolean.parseBoolean(scanner.nextLine().trim()));
    }

    @Override
    public void displayDeviceInfo() {
        super.displayDeviceInfo();
        System.out.println("Type: SmartPhone"
                + "\nBattery: " + getBatteryCapacity() + " mAh"
                + "\nCamera: " + getCameraResolution() + " MP"
                + "\n5G Support: " + (isHas5GSupport() ? "Yes" : "No"));
    }

    @Override
    public double calculateCurrentValue() {
        if (getImportDate() == null) return getOriginalPrice();
        long years = (new Date().getTime() - getImportDate().getTime()) / (1000L * 60 * 60 * 24 * 365);
        double depreciated = getOriginalPrice() * Math.pow(0.80, Math.max(0, years));
        return Math.max(depreciated, getOriginalPrice() * 0.15);
    }
}