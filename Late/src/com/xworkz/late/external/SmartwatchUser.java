package com.xworkz.late.external;

import com.xworkz.late.internal.SmartWatch;

public class SmartwatchUser {
    SmartWatch smartwatch;

    public SmartwatchUser(SmartWatch smartwatch) {
        this.smartwatch = smartwatch;
    }

    public void execute() {
        if (smartwatch != null) {
            System.out.println("checking null");
            smartwatch.trackActivity();
        }
    }
}
