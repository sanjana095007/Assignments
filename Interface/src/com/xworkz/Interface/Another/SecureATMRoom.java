package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.*;

public class SecureATMRoom implements ATM, Door, Camera {

    @Override
    public void insertCard() {
        System.out.println("running the insertCard method in SecureATMRoom");
    }

    @Override
    public void enterPin() {
        System.out.println("running the enterPin method in SecureATMRoom");
    }

    @Override
    public void withdrawCash() {
        System.out.println("running the withdrawCash method in SecureATMRoom");
    }

    @Override
    public void open() {
        System.out.println("running the open method in SecureATMRoom");
    }

    @Override
    public void close() {
        System.out.println("running the close method in SecureATMRoom");
    }

    @Override
    public void lock() {
        System.out.println("running the lock method in SecureATMRoom");
    }

    @Override
    public void clickPhoto() {
        System.out.println("running the clickPhoto method in SecureATMRoom");
    }

    @Override
    public void recordVideo() {
        System.out.println("running the recordVideo method in SecureATMRoom");
    }

    @Override
    public void zoom() {
        System.out.println("running the zoom method in SecureATMRoom");
    }

    public static class ElectricBike implements Bicycle, MobileApp, Charger {

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
}
