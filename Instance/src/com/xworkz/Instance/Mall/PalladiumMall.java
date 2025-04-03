package com.xworkz.Instance.Mall;

public class PalladiumMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Palladium Mall is an elite shopping hub.");
    }
}