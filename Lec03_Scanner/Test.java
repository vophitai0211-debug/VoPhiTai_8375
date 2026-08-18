
package Lec03_Scanner;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student ID: ");
        int ID = scanner.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + ID);
    }
}