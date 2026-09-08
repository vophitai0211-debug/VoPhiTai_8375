package Lec08_ObjectsAndClasses.NumberOfParameters;

public class OverloadingExample2 {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }
}
