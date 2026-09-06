package Lec07_Strings;

public class StringComparison {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("World");
        String s3 = s2;
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s3.equals(s2));
    }
}
