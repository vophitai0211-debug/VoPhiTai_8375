package Lec05_Loops;

import java.util.Random;

public class RandomQuestions {

    public static void main(String[] args) {
        Random rand = new Random();
        int random1 = rand.nextInt(47) + 1;
        int random2 = rand.nextInt(30 - 23 + 1) + 23;
        int random3 = rand.nextInt(5) * 2 + 4;
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
    }
}
