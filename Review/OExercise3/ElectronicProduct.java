package Review.OExercise3;

public class ElectronicProduct extends Product {

    private String brand;
    private int warrantyMonths;

    public ElectronicProduct() {
        super();
    }

    public ElectronicProduct(String id, String productName, double price, boolean isAvailable, String brand, int warrantyMonths) {
        super(id, productName, price, isAvailable);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void addProductInfo() {
        super.addProductInfo();
        System.out.print("Enter Brand: ");
        this.brand = scanner.nextLine();
        System.out.print("Enter Warranty Period (months): ");
        this.warrantyMonths = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void updateProductInfo() {
        super.updateProductInfo();
        System.out.print("Update Brand: ");
        this.brand = scanner.nextLine();
        System.out.print("Update Warranty Period (months): ");
        this.warrantyMonths = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" -> [Electronic Product] Brand: " + brand + " | Warranty: " + warrantyMonths + " months");
    }
}
