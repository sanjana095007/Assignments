package com.xworkz.Instance.Laptop;

public class Huawei extends Lap {
    public void features() {
        System.out.println("Huawei laptops come with a sleek design and solid performance.");
    }
    @Override
    public void powerOn() {
        System.out.println("Huawei Laptop is powering on");
    }
    @Override
    public void powerOff() {
        System.out.println("Huawei Laptop is shutting down");
    }
    @Override
    public void charge() {
        System.out.println("Huawei Laptop is charging.");
    }
    @Override
    public void sleep() {
        System.out.println("Huawei Laptop is entering sleep mode");
    }
    @Override
    public void restart() {
        System.out.println("Huawei Laptop is restarting");
    }
}
