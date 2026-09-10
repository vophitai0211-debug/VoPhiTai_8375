package Lec08_ObjectsAndClasses.BasicBookClass;

public class Processor {

    public static void main(String[] args) {
        Book b1 = new Book("Hello", "Phi Tai", 36000);
        Book b2 = new Book();
        b1.displayBookInfor();
        b2.input();
        b2.displayBookInfor();
    }
}
