package com.xworkz.Instance.Mall;

public class ForumMall extends Mall {
    public void visit() {

        System.out.println("Forum Mall is a trendy mall in Bangalore");
    }
    @Override
    public void open() {
        System.out.println("Forum Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("Forum Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the Forum mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in Forum mall");
    }
    @Override
    public void entertain() {
        System.out.println("Forum Mall is offering entertainment options");
    }
}
