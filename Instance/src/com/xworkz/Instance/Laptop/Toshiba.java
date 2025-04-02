package com.xworkz.Instance.Laptop;

public class Toshiba extends Lap {
    public void features() {
        super.charge();
        super.powerOff();
        super.powerOn();
        super.sleep();
        super.restart();
        System.out.println("Toshiba laptops are known for reliability and business use.");
    }
}