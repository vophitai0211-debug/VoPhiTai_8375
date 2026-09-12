package Lec11_Encapsulation.CarProfileClass;

public class Processor {

    public static void main(String[] args) {
        CarProfile c1 = new CarProfile("Japan", "Toyota", 2026);
        CarProfile c2 = new CarProfile();
        c1.displayProfile();
        c2.addProfile();
        c2.displayProfile();
    }
}
