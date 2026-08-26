package Lec06_ArrayArraylist;

import java.util.Arrays;

public class ArrToString {

    public static void main(String[] args) {
       
        int[] e = {0, 2, 4, 6, 8};
        e[1] = e[3] + e[4];
        System.out.println("e is " + Arrays.toString(e));
        System.out.print("e is [");
        for(int i=0;i<e.length;i++){
            System.out.print(e[i]+", ");
        }
        System.out.print("]");

    }
}
