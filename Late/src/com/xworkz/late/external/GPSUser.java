package com.xworkz.late.external;

import com.xworkz.late.internal.GPS;

public class GPSUser {
    GPS gps;

    public GPSUser(GPS gps) {
        this.gps = gps;
    }

    public void execute() {
        if (gps != null) {
            System.out.println("checking null");
            gps.locate();
        }
    }
}
