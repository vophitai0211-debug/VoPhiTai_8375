package Lec11_Encapsulation.BankAccountAsAClass;

public class Processor {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC01", "Phi Tai", 5000);
        acc1.display();
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.withdraw(6000);
        acc1.display();
        BankAccount acc2 = new BankAccount();
        acc2.addInfo();
        acc2.display();
    }
}
