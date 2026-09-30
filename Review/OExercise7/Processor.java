package Review.OExercise7;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        ProductArrayList list = new ProductArrayList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n===== HE THONG QUAN LY KHO SAN PHAM =====");
            System.out.println("1. Them Laptop hoac Smartphone");
            System.out.println("2. Cap nhat san pham theo ID");
            System.out.println("3. Xoa san pham theo ID");
            System.out.println("4. Hien thi tat ca san pham");
            System.out.println("5. Hien thi san pham dang con hang");
            System.out.println("6. Tim gia ban cao nhat");
            System.out.println("7. Thoat");
            System.out.print("Lua chon cua ban: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so tu 1 den 7!");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Chon loai san pham: 1 - Laptop | 2 - Smartphone");
                    int type = Integer.parseInt(sc.nextLine());
                    if (type == 1) {
                        Laptop laptop = new Laptop();
                        laptop.addProduct();
                        list.addProductToArrayList(laptop);
                    } else if (type == 2) {
                        Smartphone sp = new Smartphone();
                        sp.addProduct();
                        list.addProductToArrayList(sp);
                    } else {
                        System.out.println("Loai san pham khong hop le.");
                    }
                    break;
                case 2:
                    System.out.print("Nhap ID san pham can cap nhat: ");
                    String updateId = sc.nextLine();
                    list.updateProductById(updateId);
                    break;
                case 3:
                    System.out.print("Nhap ID san pham can xoa: ");
                    String deleteId = sc.nextLine();
                    list.deleteProductById(deleteId);
                    break;
                case 4:
                    list.displayAllProducts();
                    break;
                case 5:
                    list.displayAvailableProducts();
                    break;
                case 6:
                    double maxPrice = list.findHighestPrice();
                    System.out.println("Gia ban cao nhat trong kho la: " + maxPrice);
                    break;
                case 7:
                    System.out.println("Ket thuc chuong trinh. Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 7);
    }
}
