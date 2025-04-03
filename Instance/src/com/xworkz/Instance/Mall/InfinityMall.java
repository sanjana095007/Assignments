package com.xworkz.Instance.Mall;

public class InfinityMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Infinity Mall is a well-known mall in Mumbai.");
    }
}
