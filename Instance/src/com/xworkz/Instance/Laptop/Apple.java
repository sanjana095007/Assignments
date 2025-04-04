package com.xworkz.Instance.Laptop;

public class Apple extends Lap {
    public void features() {

        System.out.println("Apple MacBooks are known for their sleek design and macOS.");
    }
    @Override
    public void powerOn() {
        System.out.println("Apple Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Apple Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Apple Laptop is charging.");
    }
    @Override
    public void sleep() {
        System.out.println("Apple Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Apple Laptop is restarting");
    }
}
