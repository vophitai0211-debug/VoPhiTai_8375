
package Lec03_Scanner;

import java.util.Scanner;

public class FtoC {
    public static double formula(double cel){
        return (cel * 9) / 5 + 32;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter celsius: ");
        double cel = scanner.nextDouble();
        
        System.out.println("Celsius: " + cel);
        System.out.println("Fahrenheit: " + formula(cel));
    }
}
