package com.xworkz.Instance.Mall;

public class DLFPromenade extends Mall {
    public void visit() {
        super.open();
        super.shop();
        super.eat();
        super.entertain();
        super.close();
        System.out.println("DLF Promenade is a popular shopping mall in Delhi.");
    }
}
