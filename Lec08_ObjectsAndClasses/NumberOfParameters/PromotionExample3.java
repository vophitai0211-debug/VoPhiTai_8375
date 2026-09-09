package Lec08_ObjectsAndClasses.NumberOfParameters;

public class PromotionExample3 {

    public static void print(long l, long d) {
        System.out.println("Method 1");
    }

    public static void print(double d, double l) {
        System.out.println("Method 2");
    }

    public static void print(long d, double l) {
        System.out.println("Method 3");
    }

    public static void print(double d, long l) {
        System.out.println("Method 4");
    }

    public static void main(String[] args) {
        print(5, 5);
        print(5.0, 5.0);
        print(5, 5.0);
        print(5.0, 5);
    }
}
