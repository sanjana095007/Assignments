package com.xworkz.Instance.Mall;

public class ElanteMall extends Mall {
    public void visit() {

        System.out.println("Elante Mall is the largest mall in Chandigarh");
    }
    @Override
    public void open() {
        System.out.println("Elante Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Elante Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Elante mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Elante mall");
    }
    @Override
    public void entertain() {
        System.out.println("Elante Mall is offering entertainment options");
    }
}
