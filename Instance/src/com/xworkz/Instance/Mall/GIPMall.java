package com.xworkz.Instance.Mall;

public class GIPMall extends Mall {
    public void visit() {

        System.out.println("The Great India Place Mall is in Noida.");
    }
    @Override
    public void open() {
        System.out.println("GIP Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("GIP Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the GIP mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in GIP mall");
    }
    @Override
    public void entertain() {
        System.out.println("GIP Mall is offering entertainment options");
    }
}
