package Lec08_ObjectsAndClasses.CircleAsAnObject;

import java.util.Scanner;

public class CircleShape {

    private double radius;

    public CircleShape() {
    }

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = scanner.nextDouble();
    }

    public void output() {
        System.out.println("Radius = " + radius + "\nArea = " + calculateArea() + "\nCircumference = " + calculateCircumference());
    }
}
