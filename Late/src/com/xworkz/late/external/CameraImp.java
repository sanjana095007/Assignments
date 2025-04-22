package com.xworkz.late.external;

import com.xworkz.late.internal.Camera;

public class CameraImp implements Camera {

    @Override
    public void takePhoto() {
        System.out.println("running the takephoto method");
    }
}
