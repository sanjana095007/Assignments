package com.xworkz.Instance.Mall;

public class RCityMall extends Mall {
    public void visit() {

        System.out.println("R City Mall is a lively shopping mall in Mumbai.");
    }
    @Override
    public void open() {
        System.out.println("R City Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("R City Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the R City mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in R City mall");
    }
    @Override
    public void entertain() {
        System.out.println("R City Mall is offering entertainment options");
    }
}