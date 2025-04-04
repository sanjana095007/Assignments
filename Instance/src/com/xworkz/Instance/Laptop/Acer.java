package com.xworkz.Instance.Laptop;

public class Acer extends Lap {
    public void features() {

        System.out.println("Acer offers affordable and high-performance laptops.");
    }
    @Override
    public void powerOn() {
        System.out.println("Acer Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Acer Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Acer Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Acer Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Acer Laptop is restarting");
    }
}
