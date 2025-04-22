package com.xworkz.late.external;

import com.xworkz.late.internal.ATM;

public class AtmImp implements ATM {

    @Override
    public void Cash() {
        System.out.println("running the Cash method");
    }
}
