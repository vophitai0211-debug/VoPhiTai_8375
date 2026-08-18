
package Lec03_Scanner;

import java.util.Scanner;


public class AverageExercise {
    public static double average(float a,float b,float c){
        return (a + b + c) / 3;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter math point: ");
        float math = scanner.nextFloat();
        System.out.println("Enter code point: ");
        float code = scanner.nextFloat();
        System.out.println("Enter english point: ");
        float eng = scanner.nextFloat();
        
        System.out.println("Math point: " + math);
        System.out.println("Code point: " + code);
        System.out.println("English point: " + eng);
        System.out.println("Average: " + average(math, code, eng));
    }
}
