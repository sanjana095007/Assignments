package com.xworkz.Instance.Laptop;

public class EVGA extends Lap {
    public void features() {
        System.out.println("EVGA gaming laptops are built for enthusiasts and high performance.");
    }
    @Override
    public void powerOn() {
        System.out.println("EVGA Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("EVGA Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("EVGA Laptop is charging.");
    }
    @Override
    public void sleep() {
        System.out.println("EVGA Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("EVGA Laptop is restarting");
    }
}
