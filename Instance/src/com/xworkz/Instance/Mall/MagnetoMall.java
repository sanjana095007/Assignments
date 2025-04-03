package com.xworkz.Instance.Mall;

public class MagnetoMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Magneto Mall is a famous shopping spot.");
    }
}
