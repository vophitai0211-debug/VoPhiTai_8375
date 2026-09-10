package Lec08_ObjectsAndClasses.PointCoordinateClass;

import java.util.Scanner;

public class PointCoordinate {

    private double x;
    private double y;

    public PointCoordinate() {
    }

    public PointCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = scanner.nextDouble();
        System.out.println("Enter y: ");
        y = scanner.nextDouble();
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public void output() {
        System.out.println("x = " + getx() + "\ny = " + gety() + "\nDistance from O = " + distanceFromOrigin());
    }
}
