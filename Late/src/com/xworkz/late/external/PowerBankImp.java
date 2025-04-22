package com.xworkz.late.external;

import com.xworkz.late.internal.PowerBank;

public class PowerBankImp implements PowerBank {
    @Override
    public void chargeDevice() {
        System.out.println("running the chargeDevice method from PowerBank");
    }
}
