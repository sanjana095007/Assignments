package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.MusicPlayer;
import com.xworkz.Interface.Internal.Speaker;

public class BluetoothHeadset implements MusicPlayer, Speaker {
    @Override
    public void play() {
        System.out.println("running the play method in BluetoothHeadset ");
    }

    @Override
    public void pause() {
        System.out.println("running the pause method in BluetoothHeadset ");
    }

    @Override
    public void stop() {
        System.out.println("running the stop method in BluetoothHeadset ");
    }

    @Override
    public void playSound() {
        System.out.println("running the playSound method in BluetoothHeadset ");
    }

    @Override
    public void increaseVolume() {
        System.out.println("running the increaseVolume method in BluetoothHeadset ");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("running the decreaseVolume method in BluetoothHeadset ");
    }
}
