package com.xworkz.Instance.Mall;

public class InfinityMall extends Mall {
    public void visit() {

        System.out.println("Infinity Mall is a well-known mall in Mumbai");
    }
    @Override
    public void open() {
        System.out.println("Infinity Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Infinity Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Infinity mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Infinity mall");
    }
    @Override
    public void entertain() {
        System.out.println("Infinity Mall is offering entertainment options");
    }
}
