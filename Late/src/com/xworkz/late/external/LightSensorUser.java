package com.xworkz.late.external;

import com.xworkz.late.internal.LightSensor;

public class LightSensorUser {
    LightSensor lightSensor;

    public LightSensorUser(LightSensor lightSensor) {
        this.lightSensor = lightSensor;
    }

    public void execute() {
        if (lightSensor != null) {
            System.out.println("checking null");
            lightSensor.detectLight();
        }
    }
}
