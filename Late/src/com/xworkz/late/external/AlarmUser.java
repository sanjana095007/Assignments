package com.xworkz.late.external;

import com.xworkz.late.internal.Alarm;

public class AlarmUser {
    Alarm alarm;

    public AlarmUser(Alarm alarm) {
        this.alarm = alarm;
    }

    public void execute() {
        if (alarm != null) {
            System.out.println("checking null");
            alarm.ring();
        }
    }
}
