package com.xworkz.inhert.runner;

import com.xworkz.inhert.internal.TeslaModel;

public class Runner {
    public static void main(String[] args) {
        TeslaModel teslamodel = new TeslaModel();
        teslamodel.start();
        teslamodel.brake();
        teslamodel.autopilot();
        teslamodel.batteryPowered();
        teslamodel.bootSpace();
        teslamodel.drivesOnRoad();
        teslamodel.transportPeople();
        teslamodel.mechanism();
        teslamodel.hasEngine();
        teslamodel.fuelType();
        teslamodel.off();

    }
}
