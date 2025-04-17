package com.xworkz.Interface.Internal;

public class ScientificCalculator implements Calculator{
    @Override
    public void add() {
        System.out.println("running the add method");
    }

    @Override
    public void subtract() {
        System.out.println("running the subtract method");
    }

    @Override
    public void multiply() {
        System.out.println("running the multiply method");
    }
}
