package com.xworkz.Instance.Mall;

public class InorbitMall extends Mall {
    public void visit() {

        System.out.println("Inorbit Mall is a premium shopping destination");
    }
    @Override
    public void open() {
        System.out.println("Inorbit Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Inorbit Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Inorbit mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Inorbit mall");
    }
    @Override
    public void entertain() {
        System.out.println("Inorbit Mall is offering entertainment options");
    }
}
