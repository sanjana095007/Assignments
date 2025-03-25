package com.xworkz.Private;

public class Main {
    public static void main(String[] args) {
        AlienCell alienCell=new AlienCell();
        alienCell.values();
        System.out.println("=======================================================");
        CameraCell cameraCell=new CameraCell();
        cameraCell.values();
        System.out.println("=======================================================");
        IDDisplay iddisplay=new IDDisplay();
        iddisplay.values();
        System.out.println("=======================================================");
        jailerCell jail=new jailerCell();
        jail.values();
        System.out.println("=======================================================");
        SatelliteCell satelliteCell=new SatelliteCell();
        satelliteCell.values();
    }
}
