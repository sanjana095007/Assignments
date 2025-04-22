package com.xworkz.late.external;

import com.xworkz.late.internal.Heater;

public class HeaterUser {
    Heater heater;

    public HeaterUser(Heater heater) {
        this.heater = heater;
    }

    public void execute() {
        if (heater != null) {
            System.out.println("checking null");
            heater.warmRoom();
        }
    }
}
