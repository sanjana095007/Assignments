package com.xworkz.Instance.Bike;

public class Husqvarna extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Husqvarna is designed for off-road and performance.");
    }
}
