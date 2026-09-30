package Review.OExercise7;

import java.util.ArrayList;

public class ProductArrayList {

    private ArrayList<Product> products;

    public ProductArrayList() {
        this.products = new ArrayList<>();
    }

    public void addProductToArrayList(Product product) {
        products.add(product);
        System.out.println("Them san pham thanh cong!");
    }

    public void updateProductById(String id) {
        for (Product p : products) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("Da tim thay san pham. Tien hanh cap nhat:");
                p.updateProduct();
                System.out.println("Cap nhat san pham thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay san pham voi ID: " + id);
    }

    public void deleteProductById(String id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equalsIgnoreCase(id)) {
                products.remove(i);
                System.out.println("Xoa san pham co ID " + id + " thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay san pham voi ID: " + id);
    }

    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sach san pham trong.");
            return;
        }
        System.out.println("=== DANH SACH TAT CA SAN PHAM ===");
        for (Product p : products) {
            p.displayDetails();
            System.out.println("----------------------------------------");
        }
    }

    public void displayAvailableProducts() {
        boolean found = false;
        System.out.println("=== DANH SACH SAN PHAM CON HANG (AVAILABLE) ===");
        for (Product p : products) {
            if (p.isAvailable()) {
                p.displayDetails();
                System.out.println("----------------------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Hien tai khong co san pham nao con hang de ban.");
        }
    }

    public double findHighestPrice() {
        if (products.isEmpty()) {
            return 0.0;
        }
        double highest = products.get(0).calculatePrice();
        for (Product p : products) {
            double currentPrice = p.calculatePrice();
            if (currentPrice > highest) {
                highest = currentPrice;
            }
        }
        return highest;
    }
}
