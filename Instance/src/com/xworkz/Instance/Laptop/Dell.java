package com.xworkz.Instance.Laptop;

public class Dell extends Lap {
    public void features() {

        System.out.println("Dell laptops are known for durability and business use.");
    }
    @Override
    public void powerOn() {
        System.out.println("Dell Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Dell Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Dell Laptop is charging.");
    }
    @Override
    public void sleep() {
        System.out.println("Dell Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Dell Laptop is restarting");
    }
}
