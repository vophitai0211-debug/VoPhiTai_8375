
package Lec07_Strings;

import java.util.Scanner;

public class StudentIDWithSubStr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter student ID: ");
        String StudenID=scanner.nextLine();
        System.out.println("Major code: "+StudenID.substring(0, 2));
        System.out.println("Numberic part: "+StudenID.substring(2));
    }
}
