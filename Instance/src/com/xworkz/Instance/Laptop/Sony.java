package com.xworkz.Instance.Laptop;

public class Sony extends Lap {
    public void features() {

        System.out.println("Sony VAIO laptops have premium build quality.");
    }
    @Override
    public void powerOn() {
        System.out.println("Sony Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Sony Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Sony Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Sony Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Sony Laptop is restarting");
    }
}
