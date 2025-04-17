package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.Door;
import com.xworkz.Interface.Internal.Light;
import com.xworkz.Interface.Internal.SmartLock;

public class LockDoor implements Door, SmartLock, Light {

    @Override
    public void open() {
        System.out.println("running the open method in SmartDoor");
    }

    @Override
    public void close() {
        System.out.println("running the close method in SmartDoor");
    }

    @Override
    public void lock() {
        System.out.println("running the lock method in SmartDoor");
    }

    @Override
    public void breakin() {
        System.out.println("running the breakin method in SmartDoor");
    }

    @Override
    public void unlock() {
        System.out.println("running the unlock method in SmartDoor");
    }


    @Override
    public void turnOn() {
        System.out.println("running the turnOn method in SmartDoor");

    }

    @Override
    public void turnOff() {
        System.out.println("running the turnOff method in SmartDoor");

    }

    @Override
    public void dim() {
        System.out.println("running the dim method in SmartDoor");

    }
}
