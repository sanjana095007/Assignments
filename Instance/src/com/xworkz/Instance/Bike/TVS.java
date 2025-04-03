package com.xworkz.Instance.Bike;

public class TVS extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("TVS is known for reliability.");
    }
}
