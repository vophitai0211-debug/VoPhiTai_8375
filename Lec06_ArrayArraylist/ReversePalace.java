package Lec06_ArrayArraylist;

import java.util.Arrays;

public class ReversePalace {

    private static void reverseInPlace(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int oppositeIndex = numbers.length - 1 - i;
            int temp = numbers[i];
            numbers[i] = numbers[oppositeIndex];
            numbers[oppositeIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 6, 2, 8, 3};
        System.out.println("Before: " + Arrays.toString(numbers));
        reverseInPlace(numbers);
        System.out.println("After: " + Arrays.toString(numbers));
    }
}
