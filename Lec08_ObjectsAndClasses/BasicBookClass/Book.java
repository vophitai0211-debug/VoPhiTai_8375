package Lec08_ObjectsAndClasses.BasicBookClass;

import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        title = scanner.nextLine();
        System.out.println("Enter author: ");
        author = scanner.nextLine();
        System.out.println("Enter price: ");
        price = scanner.nextDouble();
    }

    public void displayBookInfor() {
        System.out.println(title + " - " + author + " - " + price);
    }
}
