package Review.OExercise7;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Product implements IProduct {

    private String id;
    private double basePrice;
    private Date importDate;
    private boolean isAvailable;
    private int quantity;

    protected static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Product() {
    }

    public Product(String id, double basePrice, Date importDate, boolean isAvailable, int quantity) {
        this.id = id;
        this.basePrice = basePrice;
        this.importDate = importDate;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        this.id = sc.nextLine();
        System.out.print("Nhap gia co ban (basePrice): ");
        this.basePrice = Double.parseDouble(sc.nextLine());

        while (true) {
            try {
                System.out.print("Nhap ngay nhap (dd/MM/yyyy): ");
                this.importDate = sdf.parse(sc.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("Dinh dang ngay khong hop le! Vui long nhap lai.");
            }
        }

        System.out.print("Con hang khong? (true/false): ");
        this.isAvailable = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhap so luong (quantity): ");
        this.quantity = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void updateProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia co ban moi: ");
        this.basePrice = Double.parseDouble(sc.nextLine());

        while (true) {
            try {
                System.out.print("Nhap ngay nhap moi (dd/MM/yyyy): ");
                this.importDate = sdf.parse(sc.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("Dinh dang ngay khong hop le! Vui long nhap lai.");
            }
        }

        System.out.print("Cap nhat tinh trang con hang (true/false): ");
        this.isAvailable = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhap so luong moi: ");
        this.quantity = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayDetails() {
        String dateStr = (importDate != null) ? sdf.format(importDate) : "N/A";
        System.out.println("ID: " + id
                + " | Base Price: " + basePrice
                + " | Import Date: " + dateStr
                + " | Available: " + isAvailable
                + " | Quantity: " + quantity);
    }
}
