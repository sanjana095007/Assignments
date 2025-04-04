package com.xworkz.Instance.Laptop;

public class MSIGaming extends Lap {
    public void features() {

        System.out.println("MSI Gaming laptops are known for their powerful specs");
    }
    @Override
    public void powerOn() {
        System.out.println("MSIGaming Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("MSIGaming Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("MSIGaming Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("MSIGaming Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("MSIGaming Laptop is restarting");
    }
}