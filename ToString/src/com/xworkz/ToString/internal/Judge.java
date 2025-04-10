package com.xworkz.ToString.internal;

public class Judge {
  private String name;
  private int casesJudged;
  private String courtName;

    public Judge(String name, int casesJudged, String courtName) {
        this.name = name;
        this.casesJudged = casesJudged;
        this.courtName = courtName;
    }

    public String toString() {
        return "Judge: " + name + ", Court: " + courtName + ", Cases Judged: " + casesJudged;
    }
    @Override
    public int hashCode() {
        return 150;
    }
}
