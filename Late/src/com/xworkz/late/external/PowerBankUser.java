package com.xworkz.late.external;

import com.xworkz.late.internal.PowerBank;

public class PowerBankUser {
    PowerBank powerBank;

    public PowerBankUser(PowerBank powerBank) {
        this.powerBank = powerBank;
    }

    public void execute() {
        if (powerBank != null) {
            System.out.println("checking null");
            powerBank.chargeDevice();
        }
    }
}
