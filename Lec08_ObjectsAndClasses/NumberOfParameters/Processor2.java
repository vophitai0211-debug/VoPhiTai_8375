package Lec08_ObjectsAndClasses.NumberOfParameters;

public class Processor2 {

    public static void main(String[] args) {
        System.out.println(OverloadingExample2.multiply(1, 2));
        System.out.println(OverloadingExample2.multiply(1, 2.0));
        System.out.println(OverloadingExample2.multiply(1, 2, 3));
    }
}
