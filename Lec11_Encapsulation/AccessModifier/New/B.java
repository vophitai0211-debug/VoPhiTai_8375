package Lec11_Encapsulation.AccessModifier.New;

import Lec11_Encapsulation.AccessModifier.Old.A;

public class B {

    public static String publicB = "publicB";
    protected static String protectedB = "protectedB";
    static String defaultB = "defaultB";
    private static String privateB = "privateB";

    public static void printVariable() {
        System.out.println(publicB);
        System.out.println(protectedB);
        System.out.println(defaultB);
        System.out.println(privateB);
        System.out.println(A.publicA);
    }

    public static void main(String[] args) {
        B.printVariable();
    }
}
