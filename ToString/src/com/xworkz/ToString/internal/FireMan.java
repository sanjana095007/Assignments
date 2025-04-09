package com.xworkz.ToString.internal;

public class FireMan {
       private String name;
       private String fireStation;
       private int emergenciesHandled;

        public FireMan(String name, String fireStation, int emergenciesHandled) {
            this.name = name;
            this.fireStation = fireStation;
            this.emergenciesHandled = emergenciesHandled;
        }

        public String toString() {
            return "Fireman: " + name + ", Station: " + fireStation + ", Emergencies Handled: " + emergenciesHandled;
        }
    }

