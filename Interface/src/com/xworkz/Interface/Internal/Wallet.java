package com.xworkz.Interface.Internal;

public interface Wallet {
    public abstract void storeMoney();
    public abstract void open();
    public abstract void close();
    default void displayStatus() {
        System.out.println("The wallet is ready to store money.");
    }
}
