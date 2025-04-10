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
}

