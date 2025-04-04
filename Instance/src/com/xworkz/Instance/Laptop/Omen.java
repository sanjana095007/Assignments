package com.xworkz.Instance.Laptop;

public class Omen extends Lap {
    public void features() {

        System.out.println("Omen by HP is designed for high-end gaming.");
    }
    @Override
    public void powerOn() {
        System.out.println("Omen Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Omen Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Omen Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Omen Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Omen Laptop is restarting");
    }
}
