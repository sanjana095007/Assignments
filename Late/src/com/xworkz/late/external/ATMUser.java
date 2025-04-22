package com.xworkz.late.external;

import com.xworkz.late.internal.ATM;

public class ATMUser {
    ATM atm;

    public ATMUser(ATM atm) {
        this.atm = atm;
    }

    public void execute() {
        if (atm != null) {
            System.out.println("checking null");
            atm.Cash();
        }
    }
}
