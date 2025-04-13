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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof BankAccount) {
                System.out.println("Reference of BankAccount will be compared");
                BankAccount bankAccount = this;
                BankAccount bankAccount1 = (BankAccount) obj;
                if (bankAccount.accountNumber == bankAccount1.accountNumber && bankAccount.balance == bankAccount1.balance && bankAccount.accountHolder.equals(bankAccount1.accountHolder)) {
                    System.out.println("Both bank accounts are same");
                    return true;
                }
            }
        }
        return false;
    }

}
