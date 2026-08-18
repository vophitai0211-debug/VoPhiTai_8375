
package Lec03_Scanner;

import java.util.Scanner;

public class Reading {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an interger number: ");
        int number = scanner.nextInt();
        
        System.out.println("number = " + number);
    }
}
