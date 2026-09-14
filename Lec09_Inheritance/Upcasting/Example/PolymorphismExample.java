package Lec09_Inheritance.Upcasting.Example;

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        for (int i = 0 ; i < 3; i ++){
            animals[i].makeSound();
        }
    }
}
