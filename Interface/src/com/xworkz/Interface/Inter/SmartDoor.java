package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Door;
import com.xworkz.Interface.Internal.SmartLock;

public class SmartDoor implements Door, SmartLock {

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


}
