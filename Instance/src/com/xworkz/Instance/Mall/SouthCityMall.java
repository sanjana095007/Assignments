package com.xworkz.Instance.Mall;

public class SouthCityMall extends Mall {
    public void visit() {

        System.out.println("South City Mall is a famous mall in Kolkata");
    }
    @Override
    public void open() {
        System.out.println("South City Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("South City Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the South City mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in South City mall");
    }
    @Override
    public void entertain() {
        System.out.println("South City Mall is offering entertainment options");
    }
}
