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
    @Override
    public int hashCode() {
        return 134;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof FireMan) {
                System.out.println("Reference of FireMan will be compared");
                FireMan fireman = this;
                FireMan fireman1 = (FireMan) obj;
                if (fireman.name.equals(fireman1.name) && fireman.fireStation.equals(fireman1.fireStation) && fireman.emergenciesHandled == fireman1.emergenciesHandled) {
                    System.out.println("Both firemen are same");
                    return true;
                }
            }
        }
        return false;
    }

}

