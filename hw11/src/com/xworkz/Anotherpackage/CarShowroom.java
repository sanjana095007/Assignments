package com.xworkz.Anotherpackage;

import com.xworkz.access.Car;

public class CarShowroom {
    Car car = new Car();
    void display(){
        car.brand = "BMW";
        car.namebrand();
        System.out.println("The name of the car is :"+car.brand);
    }

    }
