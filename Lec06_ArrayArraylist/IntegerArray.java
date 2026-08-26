
package Lec06_ArrayArraylist;

import java.util.Scanner;
import java.util.Arrays;

public class IntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
