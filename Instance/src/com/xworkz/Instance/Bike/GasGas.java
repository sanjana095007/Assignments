package com.xworkz.Instance.Bike;

public class GasGas extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("GasGas is perfect for dirt biking.");
    }
}
