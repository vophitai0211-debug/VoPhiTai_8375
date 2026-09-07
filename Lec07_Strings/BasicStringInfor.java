package Lec07_Strings;

import java.util.Scanner;

public class BasicStringInfor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String original = scanner.nextLine();
        String trimmed = original.trim();
        System.out.println("Original: [" + original + "]");
        System.out.println("Trimmerd: [" + trimmed + "]");
        System.out.println("Upper: " + trimmed.toUpperCase());
        System.out.println("Lower: " + trimmed.toLowerCase());
        System.out.println("Original lenght = " + original.length());
        System.out.println("Length after trim = " + trimmed.length());
    }
}
