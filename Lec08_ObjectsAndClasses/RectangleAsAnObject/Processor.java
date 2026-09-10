package Lec08_ObjectsAndClasses.RectangleAsAnObject;

public class Processor {

    public static void main(String[] args) {
        Rectangular r1 = new Rectangular(4, 8);
        Rectangular r2 = new Rectangular(23, 9);
        Rectangular r3 = new Rectangular();
        r1.display();
        r2.display();
        r3.input();
        r3.display();
    }
}
