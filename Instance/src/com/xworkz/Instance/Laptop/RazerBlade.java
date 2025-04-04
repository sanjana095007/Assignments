package com.xworkz.Instance.Laptop;

public class RazerBlade extends Lap {
    public void features() {

        System.out.println("Razer Blade laptops are sleek, powerful, and great for gaming");
    }
    @Override
    public void powerOn() {
        System.out.println("RazerBlade Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("RazerBlade Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("RazerBlade Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("RazerBlade Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("RazerBlade Laptop is restarting");
    }
}
