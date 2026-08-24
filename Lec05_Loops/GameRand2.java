package Lec05_Loops;

import java.util.Random;
import java.util.Scanner;

public class GameRand2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numOfError = 0;
        int point = 0;

        while (numOfError < 3) {
            int numOfTerm = rand.nextInt(4) + 2;
            int totalCorrect = 0;
            String expression = "";

            for (int i = 1; i <= numOfTerm; i++) {
                int x = rand.nextInt(10) + 1;
                totalCorrect += x;

                if (i == 1) {
                    expression += x;
                } else {
                    expression += " + " + x;
                }
            }
            
            System.out.print(expression + " = ");
            int answer = scanner.nextInt();
            if (answer == totalCorrect) {
                point++;
                System.out.println("Good! Point: " + point);
            } else {
                numOfError++;
                System.out.println("Error! Correct answer: " + totalCorrect);
                System.out.println("Number of errors: " + numOfError + "/3");
            }
        }
        System.out.println("===== END GAME =====");
        System.out.println("Total points: " + point);
    }
}