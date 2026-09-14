package Lec10_AbstractAndInterface.Interface.InterExtendsInter;

public class Circle implements IColor {

    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling the circle with green");
    }
}
