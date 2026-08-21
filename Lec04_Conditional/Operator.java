package Lec04_Conditional;

import java.util.Scanner;

public class Operator {

    public static String caculate(float a, float b, int choice) {
        switch (choice) {
            case 1:
                return a + "+" + b + " = " + (a + b);
            case 2:
                return a + "-" + b + " = " + (a - b);
            case 3:
                return a + "*" + b + " = " + (a * b);
            case 4:
                if (b == 0) {
                    return "Cannot be divided by 0";
                } else {
                    return a + "/" + b + " = " + (a / b);
                }
            default:
                return "Invailid";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        float a = scanner.nextFloat();
        System.out.println("Enter b: ");
        float b = scanner.nextFloat();
        System.out.println("Enter choice \n1.+\n2.-\n3.*\n4/: ");
        int choice = scanner.nextInt();
        System.out.println(caculate(a, b, choice));
    }
}
