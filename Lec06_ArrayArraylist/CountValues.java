package Lec06_ArrayArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountValues {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 45, 7, 68, 23, 9));
        Scanner num = new Scanner(System.in);
        System.out.print("Enter threshold: ");
        int threshold = num.nextInt();
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > threshold) {
                count++;
            }
        }
        if (count==0) {
            System.out.println("Not greater");
        } else {
            System.out.println("Count above threshold: " + count);
        }
    }
}
