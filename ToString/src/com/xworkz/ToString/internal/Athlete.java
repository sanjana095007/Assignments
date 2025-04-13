package com.xworkz.ToString.internal;

public class Athlete {
   private String name;
   private String sport;
   private int medalsWon;

    public Athlete(String name, String sport, int medalsWon) {
        this.name = name;
        this.sport = sport;
        this.medalsWon = medalsWon;
    }

    public String toString() {
        return "Athlete: " + name + ", Sport: " + sport + ", Medals Won: " + medalsWon;
    }
    @Override
    public int hashCode() {
        return 103;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj!=null){
            System.out.println("null reference");
            if(obj instanceof  Athlete){
                System.out.println("reference of Athlete ,will be compared");
                Athlete athlete=this;
                Athlete athlete1=(Athlete)obj;
                if(athlete.name.equals(athlete1.name) && athlete.sport.equals(athlete1.sport)  && athlete.medalsWon==athlete1.medalsWon){
                    System.out.println("both are same");
                    return true;
                }

            }
        }

        return false;
    }
}

