package com.xworkz.late.external;

import com.xworkz.late.internal.SmartWatch;

public class SmartWatchImp implements SmartWatch {
    @Override
    public void trackActivity() {
        System.out.println("running the trackActivity method from SmartWatch");
    }
}
