package com.xworkz.Instance.Laptop;

public class Toshiba extends Lap {
    public void features() {

        System.out.println("Toshiba laptops are known for reliability and business use");
    }
    @Override
    public void powerOn() {
        System.out.println("Toshiba Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Toshiba Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Toshiba Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Toshiba Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Toshiba Laptop is restarting");
    }
}