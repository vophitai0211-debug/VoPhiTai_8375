package Review.OExercise9;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        CloudServiceArrayList serviceList = new CloudServiceArrayList();
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        do {
            System.out.println("\n----------MENU----------");
            System.out.println("1.Add service");
            System.out.println("2.Update service by id");
            System.out.println("3.Delete service by id");
            System.out.println("4.Display all cloud services");
            System.out.println("5.Display active cloud services");
            System.out.println("6.Calculate and display the highest monthly cost among all cloud services");
            System.out.println("0.Exit");
            System.out.print("Choose option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("1.Add storage service / 2.Add compute service");
                    System.out.print("Choose type: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    if (choice == 1) {
                        StorageService ss = new StorageService();
                        ss.addService();
                        serviceList.addServiceToArrayList(ss);
                        System.out.println("Storage service added successfully");
                    } else if (choice == 2) {
                        ComputeService cs = new ComputeService();
                        cs.addService();
                        serviceList.addServiceToArrayList(cs);
                        System.out.println("Compute service added successfully");
                    } else {
                        System.out.println("Invalid selection");
                    }
                    break;
                case 2:
                    System.out.print("Enter id to update: ");
                    String updateId = scanner.nextLine();
                    serviceList.updateServiceById(updateId);
                    break;
                case 3:
                    System.out.print("Enter id to delete: ");
                    String deleteId = scanner.nextLine();
                    serviceList.deleteServiceById(deleteId);
                    break;
                case 4:
                    System.out.println("\n--- All Cloud Services ---");
                    serviceList.displayAllServices();
                    break;
                case 5:
                    System.out.println("\n--- Active Cloud Services ---");
                    serviceList.displayActiveServices();
                    break;
                case 6:
                    double maxCost = serviceList.findHighestMonthlyCost();
                    System.out.printf("Highest Monthly Cost: %.2f\n", maxCost);
                    break;
                case 0:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again");
            }
        } while (option != 0);
    }
}
