package com.xworkz.Instance.Laptop;

public class Aorus extends Lap {
    public void features() {

        System.out.println("Aorus by Gigabyte offers extreme gaming performance.");
    }
    @Override
    public void powerOn() {
        System.out.println("Aorus Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Aorus Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Aorus Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Aorus Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Aorus Laptop is restarting");
    }
}