package com.xworkz.late.external;

import com.xworkz.late.internal.Alarm;

public class AlarmImp implements Alarm {

    @Override
    public void ring() {
        System.out.println("running the ringAlarm method from Alarm");
    }
}
