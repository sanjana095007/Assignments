package com.xworkz.Interface.Internal;

public interface ATM {
    public abstract void insertCard();
    public abstract void enterPin();
    public abstract void withdrawCash();
    default void bankName() {
        System.out.println("Default bank is SBI ATM");
    }
}
