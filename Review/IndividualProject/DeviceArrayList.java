package Review.IndividualProject;

import java.util.ArrayList;

public class DeviceArrayList {

    private ArrayList<Device> deviceList = new ArrayList<>();

    public void addDevice(Device device) {
        deviceList.add(device);
    }

    public Device findDeviceById(String deviceId) {
        for (Device device : deviceList) {
            if (device.getDeviceId().equalsIgnoreCase(deviceId)) {
                return device;
            }
        }
        return null;
    }

    public void updateDeviceById(String deviceId) {
        Device device = findDeviceById(deviceId);
        if (device != null) {
            device.updateDeviceInfo();
            System.out.println("Updated device successfully!");
        } else {
            System.out.println("Device ID not found: " + deviceId);
        }
    }

    public void deleteDeviceById(String deviceId) {
        Device device = findDeviceById(deviceId);
        if (device != null) {
            deviceList.remove(device);
            System.out.println("Deleted device successfully!");
        } else {
            System.out.println("Device ID not found: " + deviceId);
        }
    }

    public void displayAllDevices() {
        if (deviceList.isEmpty()) {
            System.out.println("No devices available in the inventory.");
            return;
        }
        for (Device device : deviceList) {
            device.displayDeviceInfo();
        }
    }

    public void filterDevicesByPrice(double minPrice, double maxPrice) {
        boolean found = false;
        for (Device device : deviceList) {
            if (device.getOriginalPrice() >= minPrice && device.getOriginalPrice() <= maxPrice) {
                device.displayDeviceInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No devices found in price range $" + minPrice + " - $" + maxPrice);
        }
    }

    public void displayActiveWarrantyDevices() {
        boolean found = false;
        System.out.println("--- DEVICES UNDER WARRANTY ---");
        for (Device device : deviceList) {
            if (device.isUnderWarranty()) {
                device.displayDeviceInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No devices currently under warranty.");
        }
    }

    public void countDevicesByType() {
        int countLaptop = 0;
        int countPhone = 0;
        for (Device device : deviceList) {
            if (device instanceof Laptop) {
                countLaptop++;
            } else if (device instanceof SmartPhone) {
                countPhone++;
            }
        }
        System.out.println("Total Laptops: " + countLaptop);
        System.out.println("Total SmartPhones: " + countPhone);
    }

    public void displayInventoryValuation() {
        double totalOriginal = 0;
        double totalCurrent = 0;
        for (Device device : deviceList) {
            totalOriginal += device.getOriginalPrice();
            totalCurrent += device.calculateCurrentValue();
        }
        System.out.println("=== INVENTORY VALUATION ===");
        System.out.printf("Total Initial Value: %.2f\n", totalOriginal);
        System.out.printf("Total Depreciated Current Value: %.2f\n", totalCurrent);
    }
}