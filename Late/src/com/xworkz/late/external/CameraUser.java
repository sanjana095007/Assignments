package com.xworkz.late.external;

import com.xworkz.late.internal.Camera;

public class CameraUser {
    Camera camera;

    public CameraUser(Camera camera) {
        this.camera = camera;
    }

    public void execute() {
        if (camera != null) {
            System.out.println("checking null");
            camera.takePhoto();
        }
    }
}
