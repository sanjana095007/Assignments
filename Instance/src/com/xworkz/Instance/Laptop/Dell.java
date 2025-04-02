package com.xworkz.Instance.Laptop;

public class Dell extends Lap {
    public void features() {
        super.charge();
        super.powerOff();
        super.powerOn();
        super.sleep();
        super.restart();
        System.out.println("Dell laptops are known for durability and business use.");
    }
}
