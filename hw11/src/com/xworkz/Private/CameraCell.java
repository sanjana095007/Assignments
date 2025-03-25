package com.xworkz.Private;

public class CameraCell {
        public void displayCamera(Camera camera) {
            System.out.println("Brand: " + camera.getBrand());
            System.out.println("Price: " + camera.getPrice());
            System.out.println("Type: " + camera.getType());
            System.out.println("Connectivity: " + camera.getConnectivity());
        }

        public void values() {
            Camera camera = new Camera();
            camera.setBrand("Canon");
            camera.setPrice(1500);
            camera.setType(CameraType.DSLR);
            camera.setConnectivity("WiFi");
            displayCamera(camera);
        }
    }

