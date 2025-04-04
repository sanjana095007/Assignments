package com.xworkz.Instance.Laptop;

public class Fujitsu extends Lap {
    public void features() {

        System.out.println("Fujitsu laptops are used mainly for enterprise solutions.");
    }
    @Override
    public void powerOn() {
        System.out.println("Fujitsu Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Fujitsu Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Fujitsu Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Fujitsu Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Fujitsu Laptop is restarting");
    }
}
