package com.xworkz.ToString.internal;

public class Chef {
   private String name;
   private String hotelname;
   private int yearsOfExperience;

    public Chef(String name, String hotelname, int yearsOfExperience) {
        this.name = name;
        this.hotelname = hotelname;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String toString() {
        return "Chef: " + name + ", hotelname: " + hotelname + ", Experience: " + yearsOfExperience + " years";
    }
}

