package com.xworkz.Instance.Laptop;

public class Lenovo extends Lap {
    public void features() {

        System.out.println("Lenovo laptops offer great versatility and battery life");
    }
    @Override
    public void powerOn() {
        System.out.println("Lenovo Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Lenovo Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Lenovo Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Lenovo Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Lenovo Laptop is restarting");
    }
}
