package Lec07_Strings;

import java.util.ArrayList;

public class FindMax {

    public static int findMax(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be empty");
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(15);
        scores.add(42);
        scores.add(7);
        scores.add(33);
        scores.add(30);
        scores.add(8);
        System.out.println("Scores: " + scores);
        int maximum = findMax(scores);
        System.out.println("Maximum: " + maximum);
    }
}
