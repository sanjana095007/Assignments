package com.xworkz.Instance.Mall;

public class LuLuMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("LuLu Mall is one of the largest malls in India.");
    }
}