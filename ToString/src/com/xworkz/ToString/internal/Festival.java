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
}

