package com.xworkz.Interface.Internal;

public class BankATM implements ATM{
    @Override
    public void insertCard() {
        System.out.println("running the insert Card method");
    }

    @Override
    public void enterPin() {
        System.out.println("running the enter Pin method");
    }

    @Override
    public void withdrawCash() {
        System.out.println("running the withdrawMoney method");
    }

    @Override
    public void bankName() {
        System.out.println("running the bankName method");
    }
}
