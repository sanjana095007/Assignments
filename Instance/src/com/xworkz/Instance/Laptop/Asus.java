package com.xworkz.Instance.Laptop;

public class Asus extends Lap {
    public void features() {

        System.out.println("Asus laptops are popular among gamers and creators.");
    }
    @Override
    public void powerOn() {
        System.out.println("Asus Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Asus Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Asus Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Asus Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Asus Laptop is restarting");
    }
}
