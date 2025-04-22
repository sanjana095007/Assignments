package com.xworkz.late.external;

import com.xworkz.late.internal.Charger;

public class ChargerImp implements Charger {
    @Override
    public void supplyPower() {
        System.out.println("running the supplyPower method from Charger");
    }
}
