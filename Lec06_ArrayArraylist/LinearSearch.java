package Lec06_ArrayArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 9, 7, 2));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search number: ");
        int search = scanner.nextInt();
        for (int i = 0; i < numbers.size(); i++) {
            if (search == numbers.get(i)) {
                System.out.println("Found at index " + i);
            } else {
                System.out.println("Not found");
                return;
            }
        }
    }
}
