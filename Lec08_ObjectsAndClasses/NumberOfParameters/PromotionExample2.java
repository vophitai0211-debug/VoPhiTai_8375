package Lec08_ObjectsAndClasses.NumberOfParameters;

public class PromotionExample2 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.1, 2));
    }
}
