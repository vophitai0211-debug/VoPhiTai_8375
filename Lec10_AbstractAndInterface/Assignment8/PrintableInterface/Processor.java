package Lec10_AbstractAndInterface.Assignment8.PrintableInterface;

public class Processor {

    public static void main(String[] args) {
        // Create an object and call print()
        Printable report = new Report("Annual Financial Statement");
        report.print();
    }
}
