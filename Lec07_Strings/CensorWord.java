package Lec07_Strings;

import java.util.Scanner;

public class CensorWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to censor: ");
        String word = scanner.nextLine();
        String asterisks = "*".repeat(word.length());
        String censored = sentence.replace(word, asterisks);
        System.out.println("Censored: " + censored);
    }
}
