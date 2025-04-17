package com.xworkz.Interface.Internal;

public class BluetoothSpeaker implements Speaker{
    @Override
    public void playSound() {
        System.out.println("running the playSound method");
    }

    @Override
    public void increaseVolume() {
        System.out.println("running the increaseVolume method");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("running the decreaseVolume method");
    }
}
