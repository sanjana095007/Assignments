package com.xworkz.ToString.internal;

public class Politician {
    private String name;
    private String party;
    private int yearsInOffice;

    public Politician(String name, String party, int yearsInOffice) {
        this.name = name;
        this.party = party;
        this.yearsInOffice = yearsInOffice;
    }

    public String toString() {
        return "Politician: " + name + ", Party: " + party + ", Years in Office: " + yearsInOffice;
    }
}

