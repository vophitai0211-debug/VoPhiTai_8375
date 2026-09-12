package Lec11_Encapsulation.BankAccountAsAClass;

import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Complete deposited: " + amount);
        } else {
            System.out.println("Error");
        }
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Error");
            return false;
        }
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Complete withdrew: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

    public void addInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        setAccountNumber(scanner.nextLine());
        System.out.print("Enter owner: ");
        setOwner(scanner.nextLine());
        System.out.print("Enter balance: ");
        setBalance(scanner.nextInt());
    }

    public void display() {
        System.out.println("Account Number: " + getAccountNumber() + "\nOwner: " + getOwner() + "\nBalance: " + getBalance());
    }
}
