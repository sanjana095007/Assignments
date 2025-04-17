package com.xworkz.Interface.Internal;

public interface MusicPlayer {
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    default void showStatus() {
        System.out.println("The music player is ready to play music.");
    }
}
