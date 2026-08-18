
package Lec02_Variable;

public class OperatorExample {
    public static void main(String[] args){
        opr2();
    }
    public static void opr1(){
        int x=1;
        System.out.println(x++);
        System.out.println(x);
    }
    public static void opr2(){
        int x = 1;
        int y = --x + x - x-- - x++ + ++x + x++;
        System.out.println(x);
        System.out.println(y);
    }
}
