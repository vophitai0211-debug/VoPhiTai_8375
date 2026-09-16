package Lec10_AbstractAndInterface.Assignment8.AbstractAccountWithSharedField;

public class Processor {

    public static void main(String[] args) {
        Account savings = new SavingsAccount(1500.75);
        savings.display();
    }
}
