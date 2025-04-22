package com.xworkz.late.external;

import com.xworkz.late.internal.AirConditioner;

public class AirConditionerUser {
    AirConditioner airConditioner;

    public AirConditionerUser(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void execute() {
        if (airConditioner != null) {
            System.out.println("checking null");
            airConditioner.coolRoom();
        }
    }
}
