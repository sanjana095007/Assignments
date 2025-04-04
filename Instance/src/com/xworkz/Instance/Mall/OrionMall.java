package com.xworkz.Instance.Mall;

public class OrionMall extends Mall {
    public void visit() {

        System.out.println("Orion Mall is a premier shopping mall in Bangalore.");
    }
    @Override
    public void open() {
        System.out.println("Orion Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Orion Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Orion mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Orion mall");
    }
    @Override
    public void entertain() {
        System.out.println("Orion Mall is offering entertainment options");
    }
}
