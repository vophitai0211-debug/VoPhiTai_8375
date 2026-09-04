package Lec07_Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchWord {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        System.out.println("Words: " + words);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to find: ");
        String target = scanner.nextLine().trim();
        boolean containsWord = words.contains(target);
        int wordIndex = words.indexOf(target);
        System.out.println("Contains: " + containsWord);
        System.out.println("Index: " + wordIndex);
    }
}
