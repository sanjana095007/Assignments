package com.xworkz.ToString.internal;

public class Carpenter {
    private String name;
    private int experience;
    private String specialty;

    public Carpenter(String name, int experience, String specialty) {
        this.name = name;
        this.experience = experience;
        this.specialty = specialty;
    }

    public String toString() {
        return "Carpenter name: " + name + ", Experience: " + experience + " years, Specialty: " + specialty;
    }
}
