package com.xworkz.Private;

public class SatelliteCell {
        public void displaySatellite(Satellite satellite) {
            System.out.println("Type: " + satellite.getType());
            System.out.println("Cost: " + satellite.getCost());
            System.out.println("Weight: " + satellite.getWeight());
            System.out.println("Load Capacity: " + satellite.getLoadCapacity());
              }

        public void values() {
            Satellite satellite = new Satellite();
            satellite.setType(SatelliteType.GEO);
            satellite.setCost(5000000);
            satellite.setWeight(2000);
            satellite.setLoadCapacity(500);
            displaySatellite(satellite);
    }
}
