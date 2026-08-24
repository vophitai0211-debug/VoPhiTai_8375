package Lec05_Loops;

import java.util.Random;
import java.util.Scanner;

public class GameRand {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(20)+1;
        int guessNumber;
        int count = 0;
        do {
            System.out.print("Guess: ");
            guessNumber = scanner.nextInt();
            count++;
            if (guessNumber == randomNumber) {
                System.out.println("Victory");
                System.out.println("Guess quantity: " + count);
            } else if (guessNumber < randomNumber) {
                System.out.println("Number > " + guessNumber);
            } else {
                System.out.println("Number < " + guessNumber);
            }
        } while (guessNumber != randomNumber);
       
    }
}