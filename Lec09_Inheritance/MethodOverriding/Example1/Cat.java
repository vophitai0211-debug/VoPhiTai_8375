package Lec09_Inheritance.MethodOverriding.Example1;

import Lec09_Inheritance.MethodOverriding.Example1.Animal;

public class Cat extends Animal {

    int a = 2;

    @Override
    void makeSound() {
        System.out.println("Meow meow");
    }
}
