package com.xworkz.Instance.Mall;

public class MantriSquare extends Mall {
    public void visit() {

        System.out.println("Mantri Square is a large shopping center in Bangalore");
    }
    @Override
    public void open() {
        System.out.println("Mantri Square Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Mantri Square Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Mantri Square mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Mantri Square mall");
    }
    @Override
    public void entertain() {
        System.out.println("Mantri Square Mall is offering entertainment options");
    }
}
