package com.xworkz.Instance.Laptop;

public class Microsoft extends Lap {
    public void features() {

        System.out.println("Microsoft Surface laptops provide great Windows integration");
    }
    @Override
    public void powerOn() {
        System.out.println("Microsoft Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Microsoft Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Microsoft Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Microsoft Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Microsoft Laptop is restarting");
    }
}
