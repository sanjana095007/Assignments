package com.xworkz.late.external;


import com.xworkz.late.internal.SmartTV;

public class SmartTVImp implements SmartTV {

    @Override
    public void streamVideo() {
        System.out.println("running the streamContent method from SmartTV");
    }
}
