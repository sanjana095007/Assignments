package com.xworkz.Instance.Bike;

public class Indian extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Indian bikes are perfect for cruising.");
    }
}
