package com.xworkz.Interface.Internal;

public class LeatherWallet implements Wallet{
    @Override
    public void storeMoney() {
        System.out.println("running the store Money method");
    }

    @Override
    public void open() {
        System.out.println("running the open method");
    }

    @Override
    public void close() {
        System.out.println("running the close method");
    }

    @Override
    public void displayStatus() {
        System.out.println("running the displayStatus method");
    }
}
