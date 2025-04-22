package com.xworkz.late.external;

import com.xworkz.late.internal.Candel;

public class CandleUser {
    Candel candel;

    public CandleUser(Candel candel) {
        this.candel = candel;
    }

    public void execute() {
        if (candel != null) {
            System.out.println("checking null");
            candel.melt();
        }
    }
}
