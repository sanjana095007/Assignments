package com.xworkz.ToString.internal;

public class Scientist {
    private String name;
    private String field;
    private int discoveries;

    public Scientist(String name, String field, int discoveries) {
        this.name = name;
        this.field = field;
        this.discoveries = discoveries;
    }

    public String toString() {
        return "Scientist: " + name + ", Field: " + field + ", Discoveries: " + discoveries;
    }
    @Override
    public int hashCode() {
        return 178;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Scientist) {
                System.out.println("Reference of Scientist will be compared");
                Scientist scientist = this;
                Scientist scientist1 = (Scientist) obj;
                if (scientist.name.equals(scientist1.name)) {
                    System.out.println("Both scientists are same");
                    return true;
                }
            }
        }
        return false;
    }

}

