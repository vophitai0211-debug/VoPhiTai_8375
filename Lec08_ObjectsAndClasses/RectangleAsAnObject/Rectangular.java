package Lec08_ObjectsAndClasses.RectangleAsAnObject;

import java.util.Scanner;

public class Rectangular {

    private double length;
    private double width;

    Rectangular() {

    }

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}
