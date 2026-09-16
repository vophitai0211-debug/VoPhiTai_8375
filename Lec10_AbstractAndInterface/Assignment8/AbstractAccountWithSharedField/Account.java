package Lec10_AbstractAndInterface.Assignment8.AbstractAccountWithSharedField;

public abstract class Account {

    protected double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract String getAccountType();

    public void display() {
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Balance: " + getBalance());
    }
}
