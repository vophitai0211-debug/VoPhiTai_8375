package Lec06_ArrayArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetSetArrList {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(7, 8, 6, 9, 5));
        
        /*ArrayList<Integer> scores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Scores[" + i + "]=");
            int addNum = scanner.nextInt();
            scores.add(addNum);
        }*/
        
        int elementAtIndex2 = scores.get(2);//đọc phần tử tại index 2
        System.out.println("scores[2] = " + elementAtIndex2);
        scores.set(2, 10);//update 2 thành 10
        System.out.println("Updated scores = " + scores);
    }
}
