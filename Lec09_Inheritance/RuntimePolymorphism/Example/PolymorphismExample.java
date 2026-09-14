package Lec09_Inheritance.RuntimePolymorphism.Example;

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog) animal;
        animal.makeSound();
        System.out.println("Source: " + animal.source);
        System.out.println("Source: " + dog.source);
    }
}
