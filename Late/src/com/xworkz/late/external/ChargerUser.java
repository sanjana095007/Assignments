package com.xworkz.late.external;

import com.xworkz.late.internal.Charger;

public class ChargerUser {
    Charger charger;

    public ChargerUser(Charger charger) {
        this.charger = charger;
    }

    public void execute() {
        if (charger != null) {
            System.out.println("checking null");
            charger.supplyPower();
        }
    }
}
