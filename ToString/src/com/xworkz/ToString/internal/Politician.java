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
    @Override
    public int hashCode() {
        return 174;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Politician) {
                System.out.println("Reference of Politician will be compared");
                Politician politician = this;
                Politician politician1 = (Politician) obj;
                if (politician.name.equals(politician1.name) ) {
                    System.out.println("Both politicians are same");
                    return true;
                }
            }
        }
        return false;
    }

}

