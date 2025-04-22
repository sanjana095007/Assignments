package com.xworkz.late.external;

import com.xworkz.late.internal.SmokeDetector;

public class SmokeDetectorUser {
    SmokeDetector smokeDetector;

    public SmokeDetectorUser(SmokeDetector smokeDetector) {
        this.smokeDetector = smokeDetector;
    }

    public void execute() {
        if (smokeDetector != null) {
            System.out.println("checking null");
            smokeDetector.detectSmoke();
        }
    }
}
