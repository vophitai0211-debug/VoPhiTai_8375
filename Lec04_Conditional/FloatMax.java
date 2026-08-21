
package Lec04_Conditional;

import java.util.Scanner;

public class FloatMax {
    public static float method(float a, float b, float c){
        if(a>b&&a>c){
            return a;
        
        } else if(b>c){
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter a: ");
        float a=scanner.nextFloat();
        System.out.println("Enter b: ");
        float b=scanner.nextFloat();
        System.out.println("Enter c: ");
        float c=scanner.nextFloat();
        
        System.out.println("Max float = " + method(a,b,c));
    }
}
