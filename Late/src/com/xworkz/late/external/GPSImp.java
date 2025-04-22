package com.xworkz.late.external;

import com.xworkz.late.internal.GPS;

public class GPSImp implements GPS {
    @Override
    public void locate() {
        System.out.println("running the locate method from GPS");
    }
}
