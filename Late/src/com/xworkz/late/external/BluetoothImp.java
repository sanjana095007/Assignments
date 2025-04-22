package com.xworkz.late.external;

import com.xworkz.late.internal.Bluetooth;

public class BluetoothImp implements Bluetooth {
    @Override
    public void pair() {
        System.out.println("running the pair method from Bluetooth");
    }
}
