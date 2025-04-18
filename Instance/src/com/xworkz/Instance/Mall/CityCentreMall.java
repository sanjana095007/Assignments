package com.xworkz.Instance.Mall;

public class CityCentreMall extends Mall {
    public void visit() {
        System.out.println("City Centre Mall is a favorite among shoppers");
    }
    @Override
    public void open() {
        System.out.println("CityCentre Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("CityCentre Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the CityCentre mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in CityCentre mall");
    }
    @Override
    public void entertain() {
        System.out.println("CityCentre Mall is offering entertainment options");
    }
}
