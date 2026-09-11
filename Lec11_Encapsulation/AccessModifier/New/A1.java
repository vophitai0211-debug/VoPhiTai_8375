package Lec11_Encapsulation.AccessModifier.New;

import Lec11_Encapsulation.AccessModifier.Old.A;

public class A1 extends A {

    public static void printValue() {
        System.out.println(A.publicA);
        System.out.println(A.protectedA);
        System.out.println(B.publicB);
        System.out.println(B.protectedB);
        System.out.println(B.defaultB);
    }

    public static void main(String[] args) {
        A1.printValue();
    }
}
