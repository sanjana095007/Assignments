package com.xworkz.Instance.Mall;

public class SouthCityMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("South City Mall is a famous mall in Kolkata.");
    }
}
