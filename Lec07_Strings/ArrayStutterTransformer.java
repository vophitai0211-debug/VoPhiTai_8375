package Lec07_Strings;

import java.util.Arrays;

public class ArrayStutterTransformer {

    public static int[] stutter(int[] values) {
        int[] result = new int[values.length * 2];
        for (int i = 0; i < values.length; i++) {
            result[2 * i] = values[i];
            result[2 * i + 1] = values[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 5};
        int[] result = stutter(values);
        System.out.println("Original: " + Arrays.toString(values));
        System.out.println("New: " + Arrays.toString(result));
    }
}
