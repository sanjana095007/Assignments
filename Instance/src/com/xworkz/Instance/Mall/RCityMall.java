package com.xworkz.Instance.Mall;

public class RCityMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("R City Mall is a lively shopping mall in Mumbai.");
    }
}