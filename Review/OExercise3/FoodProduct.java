package Review.OExercise3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodProduct extends Product {

    private String category;
    private Date expiryDate;

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public FoodProduct() {
        super();
    }

    public FoodProduct(String id, String productName, double price, boolean isAvailable, String category, Date expiryDate) {
        super(id, productName, price, isAvailable);
        this.category = category;
        this.expiryDate = expiryDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void addProductInfo() {
        super.addProductInfo();
        System.out.print("Enter Category: ");
        this.category = scanner.nextLine();
        System.out.print("Enter Expiry Date (dd/MM/yyyy): ");
        try {
            this.expiryDate = DATE_FORMAT.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date format! Defaulting to current date.");
            this.expiryDate = new Date();
        }
    }

    @Override
    public void updateProductInfo() {
        super.updateProductInfo();
        System.out.print("Update Category: ");
        this.category = scanner.nextLine();
        System.out.print("Update Expiry Date (dd/MM/yyyy): ");
        try {
            this.expiryDate = DATE_FORMAT.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date format! Retaining existing date.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        String dateStr = (expiryDate != null) ? DATE_FORMAT.format(expiryDate) : "N/A";
        System.out.println(" -> [Food Product] Category: " + category + " | Expiry Date: " + dateStr);
    }
}
