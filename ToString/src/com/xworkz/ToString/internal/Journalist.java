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
}

