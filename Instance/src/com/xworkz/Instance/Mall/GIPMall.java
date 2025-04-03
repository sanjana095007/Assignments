package com.xworkz.Instance.Mall;

public class GIPMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("The Great India Place Mall is in Noida.");
    }
}
