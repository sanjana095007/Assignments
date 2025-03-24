package com.xworkz.access;

public class Vehicles {
    Car car = new Car();

    public void display() {
        car.brand = "BMW";
        car.speed = 65;
        System.out.println("the name of the car is :" + car.brand);
        System.out.println("speed: " + car.speed);
        car.namebrand();
    }
}
