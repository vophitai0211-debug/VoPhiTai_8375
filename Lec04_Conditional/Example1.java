package Lec04_Conditional;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter percent: ");
        int percent = scanner.nextInt();
        System.out.println("Enter meter: ");
        int meter = scanner.nextInt();
        int total = percent + meter;
        
        if (percent >= 90 && meter >= 40 || total > 150) {
            System.out.println("You got an A");
        } else if (percent >= 80 && meter >= 30 || total > 130) {
            System.out.println("You got a B");
        } else if (percent >= 70 && meter >= 20 || total > 110) {
            System.out.println("You got a C");
        } else if (percent >= 60 && meter >= 10 || total > 90) {
            System.out.println("You got a D");
        } else {
            System.out.println("You got a F");
        }
    }
}