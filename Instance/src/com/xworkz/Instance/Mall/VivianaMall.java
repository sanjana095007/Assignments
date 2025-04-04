package com.xworkz.Instance.Mall;


public class VivianaMall extends Mall {
    public void visit() {

        System.out.println("Viviana Mall is a family-friendly shopping center");
    }
    @Override
    public void open() {
        System.out.println("Viviana Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Viviana Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Viviana mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Viviana mall");
    }
    @Override
    public void entertain() {
        System.out.println("Viviana Mall is offering entertainment options");
    }
}
