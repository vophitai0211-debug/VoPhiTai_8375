package Review.OExercise3;

import java.util.ArrayList;

public class ProductArrayList {

    private ArrayList<Product> productArrayList;

    public ProductArrayList() {
        this.productArrayList = new ArrayList<>();
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public void addProductInfo(Product product) {
        if (product != null) {
            productArrayList.add(product);
            System.out.println("Product added successfully!");
        }
    }

    public void updateProductInfo(String id) {
        for (Product p : productArrayList) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("Product found with ID " + id + ". Please enter new info:");
                p.updateProductInfo();
                System.out.println("Update completed!");
                return;
            }
        }
        System.out.println("No product found with ID: " + id);
    }

    public void deleteProductById(String id) {
        boolean removed = productArrayList.removeIf(p -> p.getId().equalsIgnoreCase(id));
        if (removed) {
            System.out.println("Product deleted successfully for ID: " + id);
        } else {
            System.out.println("No product found to delete with ID: " + id);
        }
    }

    public void findProductById(String id) {
        for (Product p : productArrayList) {
            if (p.getId().equals(id)) {
                p.displayInfo();
                return;
            }
        }
        System.out.println("No product found with ID: " + id);
    }

    public void displayAllProducts() {
        if (productArrayList.isEmpty()) {
            System.out.println("Product list is empty!");
            return;
        }
        for (Product p : productArrayList) {
            p.displayInfo();
        }
    }

    public void countProductByType() {
        int foodCount = 0;
        int electronicCount = 0;

        for (Product p : productArrayList) {
            if (p instanceof FoodProduct) {
                foodCount++;
            } else if (p instanceof ElectronicProduct) {
                electronicCount++;
            }
        }

        System.out.println("Total Food Products: " + foodCount);
        System.out.println("Total Electronic Products: " + electronicCount);
        System.out.println("Total Products: " + productArrayList.size());
    }
}
