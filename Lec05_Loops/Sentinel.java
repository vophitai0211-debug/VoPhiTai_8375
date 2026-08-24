package Lec05_Loops;

import java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;
        double sum = 0;
        int count = 0;
        do {
            System.out.print("Enter real number(Enter 0 = Out): ");
            n = scanner.nextDouble();
            if (n != 0) {
                sum += n;
                count++;
            }
        } while (n != 0);
        if (sum == 0) {
            System.out.println("No data available");
        } else {
            System.out.println("Sum = " + sum);
            System.out.println("Quantity = " + count);
            System.out.println("Avg = " + sum / count);
        }
    }
}
