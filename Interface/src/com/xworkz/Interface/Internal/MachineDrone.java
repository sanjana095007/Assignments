package com.xworkz.Interface.Internal;

public class MachineDrone implements Drone {
    @Override
    public void hover() {
        System.out.println("running the hover method");
    }

    @Override
    public void takePicture() {
        System.out.println("running the take Picture method");
    }

    @Override
    public void returnToHome() {
        System.out.println("running the return to Home method");
    }
}
