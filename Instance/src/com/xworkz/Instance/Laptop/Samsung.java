package com.xworkz.Instance.Laptop;

public class Samsung extends Lap {
    public void features() {

        System.out.println("Samsung laptops offer a great combination of design and performance.");
    }
    @Override
    public void powerOn() {
        System.out.println("Samsung Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Samsung Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Samsung Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Samsung Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Samsung Laptop is restarting");
    }
}
