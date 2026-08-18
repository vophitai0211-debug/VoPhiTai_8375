
package Lec03_Scanner;

import java.util.Scanner;


public class CircleConstant {
    public static double perimeter(double PI, double rad){
        return 2 * PI * rad;
    }
    
    public static double acreage(double PI, double  rad){
        return PI * rad * rad;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double PI= 3.14159;
        System.out.println("Enter radius: ");
        double rad = scanner.nextDouble();
        
        System.out.println("Radius = " + rad);
        System.out.println("Perimeter = " + perimeter(PI, rad));
        System.out.println("Acreage = " + acreage(PI, rad));
    }
}
