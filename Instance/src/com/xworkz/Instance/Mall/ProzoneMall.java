package com.xworkz.Instance.Mall;

public class ProzoneMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Prozone Mall is a top shopping destination.");
    }
}
