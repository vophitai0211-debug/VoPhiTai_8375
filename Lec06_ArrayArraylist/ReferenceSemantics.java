package Lec06_ArrayArraylist;

import java.util.Arrays;
import java.util.Scanner;

public class ReferenceSemantics {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = arr1;
        arr1[0] = 2;
        System.out.println(Arrays.toString(arr2));
    }
}
