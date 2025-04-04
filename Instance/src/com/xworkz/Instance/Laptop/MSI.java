package com.xworkz.Instance.Laptop;

public class MSI extends Lap {
    public void features() {

        System.out.println("MSI is well-known for high-performance gaming laptops.");
    }
    @Override
    public void powerOn() {
        System.out.println("MSI Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("MSI Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("MSI Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("MSI Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("MSI Laptop is restarting");
    }
}
