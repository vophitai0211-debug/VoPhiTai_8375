package Review.IndividualProject;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        DeviceArrayList manager = new DeviceArrayList();
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        do {
            System.out.println("\n========== DEVICE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add new Laptop / SmartPhone");
            System.out.println("2. Update device by ID");
            System.out.println("3. Delete device by ID");
            System.out.println("4. Display all devices");
            System.out.println("5. Filter devices by price range");
            System.out.println("6. Display devices currently under warranty");
            System.out.println("7. Count devices by type");
            System.out.println("8. View inventory valuation");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option=scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Choose type (1. Laptop, 2. SmartPhone): ");
                    String type = scanner.nextLine().trim();
                    if ("1".equals(type)) {
                        Laptop laptop = new Laptop();
                        laptop.addDeviceInfo();
                        manager.addDevice(laptop);
                        System.out.println("Laptop added successfully!");
                    } else if ("2".equals(type)) {
                        SmartPhone phone = new SmartPhone();
                        phone.addDeviceInfo();
                        manager.addDevice(phone);
                        System.out.println("SmartPhone added successfully!");
                    } else {
                        System.out.println("Invalid device type!");
                    }
                    break;
                case 2:
                    System.out.print("Enter device ID to update: ");
                    String updateId = scanner.nextLine().trim();
                    manager.updateDeviceById(updateId);
                    break;
                case 3:
                    System.out.print("Enter device ID to delete: ");
                    String deleteId = scanner.nextLine().trim();
                    manager.deleteDeviceById(deleteId);
                    break;
                case 4:
                    System.out.println("\n--- ALL REGISTERED DEVICES ---");
                    manager.displayAllDevices();
                    break;
                case 5:
                    try {
                        System.out.print("Enter minimum price: ");
                        double min = Double.parseDouble(scanner.nextLine().trim());
                        System.out.print("Enter maximum price: ");
                        double max = Double.parseDouble(scanner.nextLine().trim());
                        manager.filterDevicesByPrice(min, max);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price values!");
                    }
                    break;
                case 6:
                    manager.displayActiveWarrantyDevices();
                    break;
                case 7:
                    manager.countDevicesByType();
                    break;
                case 8:
                    manager.displayInventoryValuation();
                    break;
                case 0:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }
}