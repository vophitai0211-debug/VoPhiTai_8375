
package Lec06_ArrayArraylist;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse3Method {
    public static int[] reverseWithExtraArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    public static int[] reverseWithTwoPointers(int[] arr) {
        int[] result = arr.clone();
        int left = 0;
        int right = result.length - 1;
        while (left < right) {
            int temp = result[left];
            result[left] = result[right];
            result[right] = temp;
            left++;
            right--;
        }
        return result;
    }
    private static void reverseRecursiveHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseRecursiveHelper(arr, left + 1, right - 1);
    }
    public static int[] reverseWithRecursion(int[] arr) {
        int[] result = arr.clone();
        reverseRecursiveHelper(result, 0, result.length - 1);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Method 1 (Extra Array) : " + Arrays.toString(reverseWithExtraArray(arr)));
        System.out.println("Method 2 (Two Pointers): " + Arrays.toString(reverseWithTwoPointers(arr)));
        System.out.println("Method 3 (Recursion)   : " + Arrays.toString(reverseWithRecursion(arr)));
    }
}
