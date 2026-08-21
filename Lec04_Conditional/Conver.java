package Lec04_Conditional;

import java.util.Scanner;

public class Conver {

    public static int convertion(String weekend) {
        switch (weekend) {
            case "Monday":
                return 2;
            case "Tuesday":
                return 3;
            case "Wednesday":
                return 4;
            case "Thursday":
                return 5;
            case "Friday":
                return 6;
            case "Saturday":
                return 7;
            case "Sunday":
                return 8;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String weekend = scanner.nextLine();
        System.out.println(convertion(weekend));
    }
}
