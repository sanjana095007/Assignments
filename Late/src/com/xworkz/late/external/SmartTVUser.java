package com.xworkz.late.external;

import com.xworkz.late.internal.SmartTV;

public class SmartTVUser {
    SmartTV smartTV;

    public SmartTVUser(SmartTV smartTV) {
        this.smartTV = smartTV;
    }

    public void execute() {
        if (smartTV != null) {
            System.out.println("checking null");
            smartTV.streamVideo();
        }
    }
}
