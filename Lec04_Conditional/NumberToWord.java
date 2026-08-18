package Lec04_Conditional;

import java.util.Scanner;

public class NumberToWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to 5: ");
        int n = scanner.nextInt();
        if (n < 0 || n > 5) {
            return;
        }
        switch (n) {
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
        }
    }
}
