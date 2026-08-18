package Lec04_Conditional;

import java.util.Scanner;

public class PassFail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point total: ");
        double pointTotal = scanner.nextDouble();
        if (pointTotal >= 5.0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        scanner.close();
    }
}
