package com.xworkz.Instance.Bike;

public class Vespa extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Vespa scooters are stylish and fun.");
    }
}
