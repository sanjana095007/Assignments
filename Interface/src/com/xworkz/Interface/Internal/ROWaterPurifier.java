package com.xworkz.Interface.Internal;

public class ROWaterPurifier implements WaterPurifier{
    @Override
    public void purify() {
        System.out.println("running the purify method");
    }

    @Override
    public void refillTank() {
        System.out.println("running the refill Tank method");
    }

    @Override
    public void alertForMaintenance() {
        System.out.println("running the alert For Maintenance method");
    }

    @Override
    public void clean() {
        System.out.println("running the clean method");
    }
}
