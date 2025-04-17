package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.AlarmClock;
import com.xworkz.Interface.Internal.Camera;
import com.xworkz.Interface.Internal.SmartLock;

public class SecurityCamera implements Camera, SmartLock, AlarmClock {

    @Override
    public void clickPhoto() {
        System.out.println("running the clickPhoto method in SecurityCamera");
    }

    @Override
    public void recordVideo() {
        System.out.println("running the recordVideo method in SecurityCamera");
    }

    @Override
    public void zoom() {
        System.out.println("running the zoom method in SecurityCamera");
    }

    @Override
    public void unlock() {
        System.out.println("running the unlock method in SecurityCamera");
    }

    @Override
    public void lock() {
        System.out.println("running the lock method in SecurityCamera");
    }

    @Override
    public void breakin() {
        System.out.println("running the breakin method in SecurityCamera");
    }

    @Override
    public void setAlarm() {
        System.out.println("running the setAlarm method in SecurityCamera");
    }

    @Override
    public void stopAlarm() {
        System.out.println("running the stopAlarm method in SecurityCamera");
    }

    @Override
    public void snooze() {
        System.out.println("running the snooze method in SecurityCamera");
    }
}
