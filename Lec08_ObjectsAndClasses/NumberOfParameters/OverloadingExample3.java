package Lec08_ObjectsAndClasses.NumberOfParameters;

public class OverloadingExample3 {

    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void printInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
