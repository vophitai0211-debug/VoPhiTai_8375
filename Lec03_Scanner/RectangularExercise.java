
package Lec03_Scanner;

import java.util.Scanner;


public class RectangularExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter lenght: ");
        float lenght = scanner.nextFloat();
        
        System.out.println("Enter width: ");
        float width = scanner.nextFloat();
        
        System.out.println("S = " + lenght*width);
    }
}
