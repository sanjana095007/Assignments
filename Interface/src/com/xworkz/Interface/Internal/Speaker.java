package com.xworkz.Interface.Internal;

public interface Speaker {
    public abstract void playSound();
    public abstract void increaseVolume();
    public abstract void decreaseVolume();
    default void mute() {
        System.out.println("Muting the speaker");
    }
}
