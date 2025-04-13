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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Judge) {
                System.out.println("Reference of Judge will be compared");
                Judge judge = this;
                Judge judge1 = (Judge) obj;
                if (judge.name.equals(judge1.name) && judge.casesJudged == judge1.casesJudged ) {
                    System.out.println("Both judges are same");
                    return true;
                }
            }
        }
        return false;
    }

}
