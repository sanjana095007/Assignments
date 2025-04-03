package com.xworkz.Instance.Bike;

public class Hero extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Hero bikes are common in India.");
    }
}
