package com.xworkz.Instance.Mall;


public class OberoiMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Oberoi Mall offers a luxurious shopping experience.");
    }
}
