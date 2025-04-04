package com.xworkz.Instance.Mall;

public class LuLuMall extends Mall {
    public void visit() {

        System.out.println("LuLu Mall is one of the largest malls in India.");
    }
    @Override
    public void open() {
        System.out.println("LuLu Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("LuLu Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the LuLu mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in LuLu mall");
    }
    @Override
    public void entertain() {
        System.out.println("LuLu Mall is offering entertainment options");
    }
}