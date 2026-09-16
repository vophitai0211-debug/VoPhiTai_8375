package Lec10_AbstractAndInterface.Assignment8.AbstractWithConcreteMethod;

public class Processor {

    public static void main(String[] args) {
        FullTimeEmployee empl = new FullTimeEmployee(5);
        empl.displayInfor();
        System.out.println(empl.calculateSalary());
    }
}
