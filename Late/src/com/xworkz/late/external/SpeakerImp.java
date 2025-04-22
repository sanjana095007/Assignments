package com.xworkz.late.external;

import com.xworkz.late.internal.Speaker;

public class SpeakerImp implements Speaker {
    @Override
    public void playSound() {
        System.out.println("running the playSound method from Speaker");
    }
}
