package com.xworkz.late.external;

import com.xworkz.late.internal.Drone;

public class DroneUser {
    Drone drone;

    public DroneUser(Drone drone) {
        this.drone = drone;
    }

    public void execute() {
        if (drone != null) {
            System.out.println("checking null");
            drone.fly();
        }
    }
}
