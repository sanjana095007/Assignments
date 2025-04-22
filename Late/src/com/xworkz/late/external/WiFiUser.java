package com.xworkz.late.external;

import com.xworkz.late.internal.WiFi;

public class WiFiUser {
    WiFi wifi;

    public WiFiUser(WiFi wifi) {
        this.wifi = wifi;
    }

    public void execute() {
        if (wifi != null) {
            System.out.println("checking null");
            wifi.enable();
        }
    }
}
