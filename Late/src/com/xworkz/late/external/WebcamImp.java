package com.xworkz.late.external;

import com.xworkz.late.internal.Webcam;

public class WebcamImp implements Webcam {
    @Override
    public void captureVideo() {
        System.out.println("running the captureVideo method from Webcam");
    }
}
