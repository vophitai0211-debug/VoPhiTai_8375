package Lec10_AbstractAndInterface.AbstractClass.AbtractWithConstructor;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Barks barks");
    }
}
