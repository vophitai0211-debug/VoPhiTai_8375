package Lec07_Strings;

import java.util.Scanner;

public class CountCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Enter character to count: ");
        char target = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
