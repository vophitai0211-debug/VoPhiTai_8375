
package Lec03_Scanner;

import java.util.Scanner;

public class GoodAddition {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        
        int c = a + b;
        
        System.out.println("Th result is " + c);
    }
}
