package com.xworkz.late.external;

import com.xworkz.late.internal.LightSensor;

public class LightSensorImp implements LightSensor {
    @Override
    public void detectLight() {
        System.out.println("running the detectLight method from LightSensor");
    }
}
