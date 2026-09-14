package Lec09_Inheritance.Example1;

public class ProcessorCat {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Source: " + cat.source);
        cat.makeSound();
        System.out.println("Cat's ID: " + cat.catID);
        cat.catchMouse();
    }
}
