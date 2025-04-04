package com.xworkz.Instance.Mall;

public class AmbienceMall extends Mall {
    public void visit() {

        System.out.println("Ambience Mall is one of the biggest malls in Gurgaon");
    }
    @Override
    public void open() {
        System.out.println("Ambience Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Ambience Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Ambience mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in AmbienceMall");
    }
    @Override
    public void entertain() {
        System.out.println("Ambience Mall is offering entertainment options");
    }
}
