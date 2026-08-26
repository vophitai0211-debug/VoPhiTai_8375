package Lec06_ArrayArraylist;

import java.util.Scanner;

public class CaculateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        double average = (double) sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}