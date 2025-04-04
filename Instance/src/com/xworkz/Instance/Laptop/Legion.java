package com.xworkz.Instance.Laptop;

public class Legion extends Lap {
    public void features() {

        System.out.println("Legion by Lenovo delivers powerful gaming experiences");
    }
    @Override
    public void powerOn() {
        System.out.println("Legion Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Legion Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Legion Laptop is charging");
    }
    @Override
    public void sleep() {
        System.out.println("Legion Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Legion Laptop is restarting");
    }
}
