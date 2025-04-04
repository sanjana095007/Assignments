package com.xworkz.Instance.Laptop;

public class HP extends Lap{
    public void features(){
        System.out.println("HP laptop is known for reliability and performance");
    }
    @Override
    public void powerOn() {
        System.out.println("HP Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("HP Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("HP Laptop is charging.");
    }
    @Override
    public void sleep() {
        System.out.println("HP Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("HP Laptop is restarting");
    }
}
