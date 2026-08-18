
package Lec03_Scanner;

import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a boolean:: ");
        boolean b = keyboard.nextBoolean();
        System.out.println(b);
    }

}
