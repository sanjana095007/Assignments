package com.xworkz.Abstract.internal;

public class Formalshoes extends Details{
    public Formalshoes(int cost, String brand, int size) {
        super(cost, brand, size);
    }

    @Override
    public void display() {
        System.out.println("display the formal shoes:cost"+cost +" "+"brand"+brand+" "+"size"+size);
    }
}
