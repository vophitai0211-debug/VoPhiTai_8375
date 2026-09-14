package Lec09_Inheritance.Example1;

public class ProcessorDog {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Source: " + dog.source);
        dog.makeSound();
        System.out.println("Cat's ID: " + dog.dogID);
        dog.houseDog();
    }
}
