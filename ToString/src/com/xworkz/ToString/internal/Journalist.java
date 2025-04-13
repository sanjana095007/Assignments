package com.xworkz.ToString.internal;

public class Journalist {
   private String name;
   private String newsAgency;
   private int storiesCovered;

    public Journalist(String name, String newsAgency, int storiesCovered) {
        this.name = name;
        this.newsAgency = newsAgency;
        this.storiesCovered = storiesCovered;
    }

    public String toString() {
        return "Journalist: " + name + ", News Agency: " + newsAgency + ", Stories Covered: " + storiesCovered;
    }
    @Override
    public int hashCode() {
        return 149;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Journalist) {
                System.out.println("Reference of Journalist will be compared");
                Journalist journalist = this;
                Journalist journalist1 = (Journalist) obj;
                if (journalist.name.equals(journalist1.name) && journalist.newsAgency.equals(journalist1.newsAgency) ) {
                    System.out.println("Both journalists are same");
                    return true;
                }
            }
        }
        return false;
    }

}

