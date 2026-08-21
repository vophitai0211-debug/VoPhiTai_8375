package Lec04_Conditional;

import java.util.Scanner;

public class Triangle {

    public static String method(double a, double b, double c) {
        if (a > 0 || b > 0 || c > 0 && ((a + b) > c || (a + c) > b || (b + c) > a)) {
            if (a == b && a == c) {
                return "Isosceles triangle";
            } else if (a == b || a == c || b == c) {
                return "Equilateral triangle";
            } else {
                return "Normal triangle";
            }
        }
        return "Not a triangle";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        System.out.println(method(a, b, c));
    }
}
