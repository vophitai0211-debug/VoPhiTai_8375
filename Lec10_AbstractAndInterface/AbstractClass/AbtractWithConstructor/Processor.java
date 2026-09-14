package Lec10_AbstractAndInterface.AbstractClass.AbtractWithConstructor;

public class Processor {

    public static void main(String[] args) {
        Dog dog = new Dog("Lulu");
        dog.displayName();
        dog.makeSound();
    }
}
