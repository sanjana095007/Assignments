package com.xworkz.Instance.Laptop;

public class Razer extends Lap {
    public void features() {

        System.out.println("Razer laptops are designed for gamers with top-tier specs.");
    }
    @Override
    public void powerOn() {
        System.out.println("Razer Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Razer Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Razer Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Razer Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Razer Laptop is restarting");
    }
}
