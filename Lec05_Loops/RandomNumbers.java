package Lec05_Loops;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        int n1 = random.nextInt(20) + 1;
        System.out.println("Random from 1 to 20: " + n1);

        int min = 4;
        int max = 10;
        int rangeSize = max - min + 1;
        int n2 = random.nextInt(rangeSize) + min;
        System.out.println("Range: " + n2);
    }
}
