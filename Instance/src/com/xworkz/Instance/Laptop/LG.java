package com.xworkz.Instance.Laptop;

public class LG extends Lap {
    public void features() {

        System.out.println("LG laptops are lightweight with long battery life");
    }
    @Override
    public void powerOn() {
        System.out.println("LG Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("LG Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("LG Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("LG Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("LG Laptop is restarting");
    }
}
