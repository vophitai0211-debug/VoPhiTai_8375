
package Lec05_Loops;

import java.util.Scanner;

public class PrintNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
