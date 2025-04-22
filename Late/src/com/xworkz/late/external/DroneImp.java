package com.xworkz.late.external;

import com.xworkz.late.internal.Drone;

public class DroneImp implements Drone {
    @Override
    public void fly() {
        System.out.println("running the fly method from Drone");
    }
}
