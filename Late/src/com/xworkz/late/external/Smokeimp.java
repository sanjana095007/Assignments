package com.xworkz.late.external;

import com.xworkz.late.internal.SmokeDetector;

public class Smokeimp implements SmokeDetector {
    @Override
    public void detectSmoke() {
        System.out.println("running the detectSmoke method");
    }
}
