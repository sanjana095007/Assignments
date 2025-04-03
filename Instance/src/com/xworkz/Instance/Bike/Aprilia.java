package com.xworkz.Instance.Bike;

public class Aprilia extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Aprilia offers a stylish ride.");
    }
}
