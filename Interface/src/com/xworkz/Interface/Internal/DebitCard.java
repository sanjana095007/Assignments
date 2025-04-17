package com.xworkz.Interface.Internal;

public interface DebitCard {
    public abstract void withdraw();
    public abstract void deposit();
    public abstract void checkBalance();
    default void Transaction() {
        System.out.println("Default Transaction method");
    }
}
