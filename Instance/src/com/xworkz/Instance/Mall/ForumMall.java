package com.xworkz.Instance.Mall;

public class ForumMall extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("Forum Mall is a trendy mall in Bangalore.");
    }
}
