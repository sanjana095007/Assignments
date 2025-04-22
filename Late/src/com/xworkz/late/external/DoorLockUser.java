package com.xworkz.late.external;

import com.xworkz.late.internal.DoorLock;

public class DoorLockUser {
    DoorLock doorLock;

    public DoorLockUser(DoorLock doorLock) {
        this.doorLock = doorLock;
    }

    public void execute() {
        if (doorLock != null) {
            System.out.println("checking null");
            doorLock.lock();
        }
    }
}
