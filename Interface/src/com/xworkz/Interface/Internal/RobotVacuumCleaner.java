package com.xworkz.Interface.Internal;

public class RobotVacuumCleaner implements VacuumCleaner{
    @Override
    public void startCleaning() {
        System.out.println("running the startCleaning method");
    }

    @Override
    public void stopCleaning() {
        System.out.println("running the stopCleaning method");
    }


    @Override
    public void emptyBin() {
        System.out.println("running the empty Bin method");
    }

    @Override
    public void Cleaning() {
        System.out.println("running the Cleaning method");
    }
}
