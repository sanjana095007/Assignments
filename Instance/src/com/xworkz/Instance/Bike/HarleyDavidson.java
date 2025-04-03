package com.xworkz.Instance.Bike;

public class HarleyDavidson extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Harley Davidson is an iconic cruiser.");
    }
}
