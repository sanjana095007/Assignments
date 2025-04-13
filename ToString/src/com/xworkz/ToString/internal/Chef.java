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
    @Override
    public int hashCode() {
        return 116;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Chef) {
                System.out.println("Reference of Chef will be compared");
                Chef chef = this;
                Chef chef1 = (Chef) obj;
                if (chef.name.equals(chef1.name) && chef.hotelname.equals(chef1.hotelname) && chef.yearsOfExperience == chef1.yearsOfExperience) {
                    System.out.println("Both chefs are same");
                    return true;
                }
            }
        }
        return false;
    }

}

