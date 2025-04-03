package com.xworkz.Instance.Bike;

public class Yamaha extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.stop();
        super.honk();
        System.out.println("Yamaha is racing on the highway.");
    }
}
