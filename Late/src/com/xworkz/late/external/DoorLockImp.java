package com.xworkz.late.external;

import com.xworkz.late.internal.DoorLock;

public class DoorLockImp implements DoorLock {

    @Override
    public void lock() {
        System.out.println("running the lock method");
    }
}
