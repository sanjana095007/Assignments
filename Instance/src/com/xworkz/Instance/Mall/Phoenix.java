package com.xworkz.Instance.Mall;

public class Phoenix extends Mall {
    public void visit() {
        System.out.println("Phoenix is a popular shopping destination");
    }
    @Override
    public void open() {
        System.out.println("Phoenix Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Phoenix Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Phoenix mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Phoenix mall");
    }
    @Override
    public void entertain() {
        System.out.println("Phoenix Mall is offering entertainment options");
    }
}