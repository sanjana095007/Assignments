package com.xworkz.late.external;

import com.xworkz.late.internal.SmartLight;

public class SmartLightUser {
    SmartLight smartLight;

    public SmartLightUser(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    public void execute() {
        if (smartLight != null) {
            System.out.println("checking null");
            smartLight.turnOn();
        }
    }
}
