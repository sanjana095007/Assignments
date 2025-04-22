package com.xworkz.late.external;

import com.xworkz.late.internal.FaceRecognition;

public class FaceRecognitionUser {
    FaceRecognition faceRecognition;

    public FaceRecognitionUser(FaceRecognition faceRecognition) {
        this.faceRecognition = faceRecognition;
    }

    public void execute() {
        if (faceRecognition != null) {
            System.out.println("checking null");
            faceRecognition.detectFace();
        }
    }
}
