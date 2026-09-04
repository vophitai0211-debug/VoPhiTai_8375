package Lec07_Strings;

import java.util.Arrays;

public class ReturnNew {

    public static int[] stutter(int[] values) {
        if (values == null) {
            return null;
        }
        int[] result = new int[values.length * 2];
        for (int i = 0; i < values.length; i++) {
            result[2 * i] = values[i];
            result[2 * i + 1] = values[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 4, 0, 7};

        int[] stuttered = stutter(original);

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("New: " + Arrays.toString(stuttered));
    }
}
