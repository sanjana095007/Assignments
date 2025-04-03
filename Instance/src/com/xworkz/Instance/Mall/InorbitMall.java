package com.xworkz.Instance.Mall;

public class InorbitMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Inorbit Mall is a premium shopping destination.");
    }
}
