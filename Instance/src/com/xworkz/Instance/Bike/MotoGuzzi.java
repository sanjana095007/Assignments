package com.xworkz.Instance.Bike;

public class MotoGuzzi extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Moto Guzzi is an Italian classic.");
    }
}
