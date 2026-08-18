
package Lec03_Scanner;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter total seconds: ");
        int totalSec = scanner.nextInt();
        int h = totalSec / 3600;
        int m = (totalSec % 3600) / 60;
        int s = totalSec % 60;
        System.out.println("Time: " + h + ":" + m + ":" + s);
    }
}
