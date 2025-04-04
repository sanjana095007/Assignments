package com.xworkz.Instance.Laptop;

public class Panasonic extends Lap {
    public void features() {

        System.out.println("Panasonic Toughbooks are rugged and durable for extreme use");
    }
    @Override
    public void powerOn() {
        System.out.println("Panasonic Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Panasonic Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Panasonic Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Panasonic Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Panasonic Laptop is restarting");
    }
}