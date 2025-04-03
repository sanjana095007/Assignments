package com.xworkz.Instance.Mall;

public class CityCentreMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("City Centre Mall is a favorite among shoppers.");
    }
}
