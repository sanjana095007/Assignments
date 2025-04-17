package com.xworkz.Interface.Internal;

public class MP3Player implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("running the play method");
    }

    @Override
    public void pause() {
        System.out.println("running the pause method");
    }

    @Override
    public void stop() {
        System.out.println("running the stop method");
    }
}
