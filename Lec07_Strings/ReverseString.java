
package Lec07_Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String original=scanner.nextLine();
        StringBuilder reversed=new StringBuilder(original);
        System.out.println("Original: "+original);
        System.out.println("Reversed: "+reversed.reverse().toString());
    }
}
