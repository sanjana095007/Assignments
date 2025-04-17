package com.xworkz.Interface.Internal;

public class Rupay implements DebitCard{
    @Override
    public void withdraw() {
        System.out.println("running the with draw method");
    }

    @Override
    public void deposit() {
        System.out.println("running the deposit method");
    }

    @Override
    public void checkBalance() {
        System.out.println("running the check Balance method");
    }
}
