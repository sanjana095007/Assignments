package com.xworkz.inhert.runner;
import com.xworkz.inhert.Hierarchical.*;
import com.xworkz.inhert.Muti.S24Ultra;
import com.xworkz.inhert.internal.TeslaModel;

public class Runner {
    public static void main(String[] args) {
        TeslaModel teslamodel = new TeslaModel();
        teslamodel.start();
        teslamodel.brake();
        teslamodel.autopilot();
        teslamodel.batteryPowered();
        teslamodel.bootSpace();
        teslamodel.drivesOnRoad();
        teslamodel.transportPeople();
        teslamodel.mechanism();
        teslamodel.hasEngine();
        teslamodel.fuelType();
        teslamodel.off();
        System.out.println("======================multi-level=============================");
        S24Ultra s24Ultra=new S24Ultra();

        s24Ultra.exists();
        s24Ultra.usedByHumans();
        s24Ultra.helpsCommunicate();
        s24Ultra.oldWays();
        s24Ultra.hasWiredConnection();
        s24Ultra.wirelessCalling();
        s24Ultra.hasApps();
        s24Ultra.hasAndroidOS();
        s24Ultra.premiumFeatures();
        s24Ultra.brand();
        s24Ultra.modelInfo();
        System.out.println("======================Hybrid=============================");
        Car car = new Car();
        car.start();
        car.drive();

        Bike bike = new Bike();
        bike.start();
        bike.ride();

        Truck truck = new Truck();
        truck.start();
        truck.loadGoods();

        Bus bus = new Bus();
        bus.start();
        bus.carryPassengers();

        AutoRickshaw auto = new AutoRickshaw();
        auto.start();
        auto.meterFare();

        Scooter scooter = new Scooter();
        scooter.start();
        scooter.balance();

        Van van = new Van();
        van.start();
        van.transportItems();

        Ambulance ambulance = new Ambulance();
        ambulance.start();
        ambulance.emergency();

        FireTruck fireTruck = new FireTruck();
        fireTruck.start();
        fireTruck.extinguishFire();

        PoliceCar policeCar = new PoliceCar();
        policeCar.start();
        policeCar.patrol();
    }
}
