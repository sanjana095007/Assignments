package com.xworkz.Instance.Mall;

public class MagnetoMall extends Mall {
    public void visit() {

        System.out.println("Magneto Mall is a famous shopping spot.");
    }
    @Override
    public void open() {
        System.out.println("Magneto Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Magneto Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Magneto mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Magneto mall");
    }
    @Override
    public void entertain() {
        System.out.println("Magneto Mall is offering entertainment options");
    }
}
