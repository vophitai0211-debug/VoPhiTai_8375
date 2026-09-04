package Lec07_Strings;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {11, 42, -5, 27, 0, 89};

        System.out.println("Before: " + Arrays.toString(numbers));

        reverseInPlace(numbers);

        System.out.println("After: " + Arrays.toString(numbers));
    }
}
