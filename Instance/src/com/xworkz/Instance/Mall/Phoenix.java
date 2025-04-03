package com.xworkz.Instance.Mall;

public class Phoenix extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Phoenix is a popular shopping destination.");
    }
}