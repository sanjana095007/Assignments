package com.xworkz.Instance.Bike;

public class Kawasaki extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.stop();
        super.honk();
        System.out.println("Kawasaki is zooming past traffic.");
    }
}
