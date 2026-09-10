package Lec08_ObjectsAndClasses.CircleAsAnObject;

public class Processor {

    public static void main(String[] args) {
        CircleShape c1 = new CircleShape(4);
        CircleShape c2 = new CircleShape();
        c1.output();
        c2.input();
        c2.output();
    }
}
