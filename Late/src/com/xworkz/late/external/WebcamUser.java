package com.xworkz.late.external;

import com.xworkz.late.internal.Webcam;

public class WebcamUser {
    Webcam webcam;

    public WebcamUser(Webcam webcam) {
        this.webcam = webcam;
    }

    public void execute() {
        if (webcam != null) {
            System.out.println("checking null");
            webcam.captureVideo();
        }
    }
}
