
package Lec03_Scanner;

import java.util.Scanner;

public class StudentInfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter GPA: ");
        float gpa = scanner.nextFloat();
        
        scanner.nextLine();
        
        System.out.println("Enter specialized: ");
        String spec = scanner.nextLine(); 
        
        System.out.println("Enter hometown: ");
        String htown = scanner.nextLine();
        
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Specialized: " + spec);
        System.out.println("Hometown: " + htown);
    }
}
