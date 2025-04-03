package com.xworkz.Instance.Bike;

public class Benelli extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Benelli bikes offer a unique ride experience.");
    }
}
