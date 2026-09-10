package Lec08_ObjectsAndClasses.PointCoordinateClass;

public class Processor {

    public static void main(String[] args) {
        PointCoordinate p1 = new PointCoordinate(2, 3);
        PointCoordinate p2 = new PointCoordinate();
        p1.output();
        p2.input();
        p2.output();
    }
}
