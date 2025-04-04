package com.xworkz.Instance.Laptop;

public class Alienware extends Lap {
    public void features() {

        System.out.println("Alienware by Dell is a premium gaming laptop brand.");
    }
    @Override
    public void powerOn() {
        System.out.println("Alienware Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Alienware Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Alienware Laptop is charging.");
    }
    @Override
    public void sleep() {
        System.out.println("Alienware Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Alienware Laptop is restarting");
    }
}
