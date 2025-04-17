package com.xworkz.Interface.Internal;

public interface Camera {
    public abstract void clickPhoto();
    public abstract void recordVideo();
    public abstract void zoom();
    default void focus() {
        System.out.println("Default focus method: focusing the camera lens.");
    }
}
