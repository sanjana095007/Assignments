package com.xworkz.late.external;

import com.xworkz.late.internal.WiFi;

public class WiFiImp implements WiFi {
    @Override
    public void enable() {
        System.out.println("running the enable method from WiFi");
    }
}
