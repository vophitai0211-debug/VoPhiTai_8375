package Lec10_AbstractAndInterface.Assignment8.ImplementingTwoInterface;

public class Circle implements Drawable, Colorable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling the circle with color.");
    }
}
