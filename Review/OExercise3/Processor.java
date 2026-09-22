package Review.OExercise3;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        ProductArrayList manager = new ProductArrayList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== PRODUCT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Food Product");
            System.out.println("2. Add Electronic Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Update Product by ID");
            System.out.println("5. Delete Product by ID");
            System.out.println("6. Find Product by ID");
            System.out.println("7. Count Products by Type");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    FoodProduct food = new FoodProduct();
                    food.addProductInfo();
                    manager.addProductInfo(food);
                    break;
                case 2:
                    ElectronicProduct electronic = new ElectronicProduct();
                    electronic.addProductInfo();
                    manager.addProductInfo(electronic);
                    break;
                case 3:
                    manager.displayAllProducts();
                    break;
                case 4:
                    System.out.print("Enter Product ID to update: ");
                    String updateId = scanner.nextLine();
                    manager.updateProductInfo(updateId);
                    break;
                case 5:
                    System.out.print("Enter Product ID to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteProductById(deleteId);
                    break;
                case 6:
                    System.out.print("Enter Product ID to find: ");
                    String findId = scanner.nextLine();
                    manager.findProductById(findId);
                    break;
                case 7:
                    manager.countProductByType();
                    break;
                case 0:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
