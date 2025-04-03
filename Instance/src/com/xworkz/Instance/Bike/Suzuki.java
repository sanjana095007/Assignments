package com.xworkz.Instance.Bike;

public class Suzuki extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.stop();
        super.honk();
        System.out.println("Suzuki is cruising on the road.");
    }
}
