package com.xworkz.ToString.internal;

public class Zookeeper {
    private String name;
    private String zooName;
    private int animalsCaredFor;

    public Zookeeper(String name, String zooName, int animalsCaredFor) {
        this.name = name;
        this.zooName = zooName;
        this.animalsCaredFor = animalsCaredFor;
    }

    public String toString() {
        return "Zookeeper: " + name + ", Zoo: " + zooName + ", Animals Cared For: " + animalsCaredFor;
    }
    @Override
    public int hashCode() {
        return 199;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Zookeeper) {
                System.out.println("Reference of Zookeeper will be compared");
                Zookeeper zoo = this;
                Zookeeper zoo1 = (Zookeeper) obj;
                if (zoo.name.equals(zoo1.name)) {
                    System.out.println("Both zookeepers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

