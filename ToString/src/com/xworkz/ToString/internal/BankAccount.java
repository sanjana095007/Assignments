package com.xworkz.ToString.internal;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "accountHolder: " + accountHolder + ", accountNumber: " + accountNumber + ", balance: " + balance;
    }
    @Override
    public int hashCode() {
        return 106;
    }
}
