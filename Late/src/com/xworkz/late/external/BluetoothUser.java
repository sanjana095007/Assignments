package com.xworkz.late.external;

import com.xworkz.late.internal.Bluetooth;

public class BluetoothUser {
    Bluetooth bluetooth;

    public BluetoothUser(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void execute() {
        if (bluetooth != null) {
            System.out.println("checking null");
            bluetooth.pair();
        }
    }
}
