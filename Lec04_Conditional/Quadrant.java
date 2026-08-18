package Lec04_Conditional;

import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x: ");
        float x = scanner.nextFloat();
        System.out.println("Enter y: ");
        float y = scanner.nextFloat();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        }
        if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        }
        if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        }
        if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        }
        if (x == 0 && y == 0) {
            System.out.println("Thanh Hoa");
        }
    }
}