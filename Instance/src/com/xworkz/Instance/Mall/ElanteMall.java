package com.xworkz.Instance.Mall;

public class ElanteMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Elante Mall is the largest mall in Chandigarh.");
    }
}
