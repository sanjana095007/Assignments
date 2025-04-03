package com.xworkz.Instance.Bike;
public class KTM extends Bikes {
public void ride() {
    super.start();
    super.accelerate();
    super.brake();
    super.stop();
    super.honk();
    System.out.println("KTM is tearing up the streets.");
}
}