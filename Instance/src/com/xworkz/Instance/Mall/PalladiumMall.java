package com.xworkz.Instance.Mall;

public class PalladiumMall extends Mall {
    public void visit() {
        System.out.println("Palladium Mall is an elite shopping hub.");
    }
    @Override
    public void open() {
        System.out.println("Palladium Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Palladium Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Palladium mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Palladium mall");
    }
    @Override
    public void entertain() {
        System.out.println("Palladium Mall is offering entertainment options");
    }
}