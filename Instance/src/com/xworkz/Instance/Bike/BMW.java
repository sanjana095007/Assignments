package com.xworkz.Instance.Bike;

public class BMW extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("BMW bikes offer luxury and power.");
    }
}
