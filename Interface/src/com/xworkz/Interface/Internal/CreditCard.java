package com.xworkz.Interface.Internal;

public interface CreditCard {
    public abstract void swipe();
    public abstract void tap();
    public abstract void enterPin();
    default void checkBalance() {
        System.out.println("Default checkBalance method");
    }
}
