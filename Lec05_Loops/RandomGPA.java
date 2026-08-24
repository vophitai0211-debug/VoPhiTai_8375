package Lec05_Loops;

import java.util.Random;

public class RandomGPA {

    public static void main(String[] args) {
        Random rand = new Random();
        double randomGPA = rand.nextDouble() * 2.5 + 1.5;
        System.out.println("GPA: " + randomGPA);
    }
}
