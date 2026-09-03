package Lec06_ArrayArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateScore {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score: ");
            int addNum = scanner.nextInt();
            scores.add(addNum);
            sum += addNum;
            count++;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum / count);
    }
}
