package Lec10_AbstractAndInterface.Assignment8.AbstractAccountWithSharedField;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
