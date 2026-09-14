package Lec09_Inheritance.MethodOverriding.Example1;

import Lec09_Inheritance.MethodOverriding.Example1.Cat;

public class Processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        System.out.println(cat.a);
        Animal animal = new Cat();
        System.out.println(animal.a);
        Cat cat2 = (Cat) animal;
        System.out.println(cat2.a);

    }

}
