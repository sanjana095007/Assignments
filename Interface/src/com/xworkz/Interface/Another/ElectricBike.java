package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.Bicycle;
import com.xworkz.Interface.Internal.Charger;
import com.xworkz.Interface.Internal.MobileApp;

public class ElectricBike implements Bicycle, MobileApp, Charger {

    @Override
    public void pedal() {
        System.out.println("running the pedal method in ElectricScooter");
    }

    @Override
    public void brake() {
        System.out.println("running the brake method in ElectricScooter");
    }

    @Override
    public void ringBell() {
        System.out.println("running the ringBell method in ElectricScooter");
    }

    @Override
    public void openApp() {
        System.out.println("running the openApp method in ElectricScooter");
    }

    @Override
    public void performAction() {
        System.out.println("running the performAction method in ElectricScooter");
    }

    @Override
    public void closeApp() {
        System.out.println("running the closeApp method in ElectricScooter");
    }

    @Override
    public void plugIn() {
        System.out.println("running the plugIn method in ElectricScooter");

    }

    @Override
    public void chargeDevice() {
        System.out.println("running the chargeDevice method in ElectricScooter");

    }

    @Override
    public void unplug() {
        System.out.println("running the unplug method in ElectricScooter");

    }
}
