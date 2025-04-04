package com.xworkz.Instance.Mall;

public class ExpressAvenue extends Mall {
    public void visit() {

        System.out.println("Express Avenue is a popular mall in Chennai.");
    }
    @Override
    public void open() {
        System.out.println("ExpressAvenue Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("ExpressAvenue Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the ExpressAvenue mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in ExpressAvenue mall");
    }
    @Override
    public void entertain() {
        System.out.println("ExpressAvenue Mall is offering entertainment options");
    }
}