package com.xworkz.Instance.Laptop;

public class ROG extends Lap {
    public void features() {

        System.out.println("ROG (Republic of Gamers) by ASUS offers top-tier gaming laptops.");
    }
    @Override
    public void powerOn() {
        System.out.println("ROG Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("ROG Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("ROG Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("ROG Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("ROG Laptop is restarting");
    }
}
