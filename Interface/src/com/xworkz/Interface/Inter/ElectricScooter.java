package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Bicycle;
import com.xworkz.Interface.Internal.MobileApp;

public class ElectricScooter implements Bicycle, MobileApp {
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
}
