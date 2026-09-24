package Review.OExercise5;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        VehicleArrayList vehicleList = new VehicleArrayList();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Add new Car / Motorbike");
            System.out.println("2. Update Vehicle by id");
            System.out.println("3. Delete Vehicle by id");
            System.out.println("4. Find Vehicle by id");
            System.out.println("5. Display all Vehicles");
            System.out.println("6. Calculate total rental cost");
            System.out.println("7. Count the number of Car and Motorbike individually");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Choose 1.Car, 2.Motorbike");
                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        Car car = new Car();
                        car.addVehicleInfo();
                        vehicleList.addVehicle(car);
                        System.out.println("Add car complete");
                    } else if (choice == 2) {
                        Motorbike motorbike = new Motorbike();
                        motorbike.addVehicleInfo();
                        vehicleList.addVehicle(motorbike);
                        System.out.println("Add motorbike complete");
                    } else {
                        System.out.println("Error");
                    }
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Enter id to update vehicle: ");
                    String updateId = scanner.nextLine();
                    vehicleList.updateVehicle(updateId);
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.print("Enter id to delete vehicle: ");
                    String deleteId = scanner.nextLine();
                    vehicleList.deleteVehicleById(deleteId);
                    break;

                case 4:
                    scanner.nextLine();
                    System.out.print("Enter id to find vehicle: ");
                    String findId = scanner.nextLine();

                    Vehicle vehicle = vehicleList.findVehicleById(findId);

                    if (vehicle != null) {
                        vehicle.displayInfo();
                    } else {
                        System.out.println("Can't find id");
                    }
                    break;

                case 5:
                    System.out.println("---DISPLAY ALL VEHICLES---");
                    vehicleList.displayAllVehicles();
                    break;

                case 6:
                    System.out.println("Total rental cost: "
                            + vehicleList.calculateTotalRentalCost());
                    break;

                case 7:
                    System.out.println("The number of Cars and Motorbikes individually:");
                    vehicleList.countVehicleByType();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }

        } while (option != 0);

        scanner.close();
    }
}
