package com.xworkz.ToString.internal;

public class Festival {
    private String name;
    private  String country;
    private  String month;

    public Festival(String name, String country, String month) {
        this.name = name;
        this.country = country;
        this.month = month;
    }

    @Override
    public String toString() {
        return "name :"+name+" "+ "country :"+country+" "+"month :"+month;
    }
    @Override
    public int hashCode() {
        return 133;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Festival) {
                System.out.println("Reference of Festival will be compared");
                Festival festival = this;
                Festival festival1 = (Festival) obj;
                if (festival.name.equals(festival1.name) && festival.country.equals(festival1.country) && festival.month.equals(festival1.month)) {
                    System.out.println("Both festivals are same");
                    return true;
                }
            }
        }
        return false;
    }

}

