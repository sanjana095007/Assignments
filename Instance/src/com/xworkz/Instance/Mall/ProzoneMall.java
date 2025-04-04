package com.xworkz.Instance.Mall;

public class ProzoneMall extends Mall {
    public void visit() {

        System.out.println("Prozone Mall is a top shopping destination.");
    }
    @Override
    public void open() {
        System.out.println("Prozone Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Prozone Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Prozone mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Prozone mall");
    }
    @Override
    public void entertain() {
        System.out.println("Prozone Mall is offering entertainment options");
    }
}
