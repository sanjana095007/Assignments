package com.xworkz.Instance.Mall;

public class AmbienceMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Ambience Mall is one of the biggest malls in Gurgaon.");
    }
}
