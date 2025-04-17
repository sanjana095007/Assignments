package com.xworkz.Interface.Internal;

public interface Drone {
    public abstract void hover();
    public abstract void takePicture();
    public abstract void returnToHome();
    default void Status() {
        System.out.println("Default displayStatus method");
    }
}
