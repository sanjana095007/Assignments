package com.xworkz.Instance.Laptop;

public class HP extends Lap{
    public void features(){
        super.charge();
        super.powerOff();
        super.powerOn();
        super.sleep();
        super.restart();
        System.out.println("HP laptop is known for reliability and performance");
    }
}
