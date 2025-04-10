package com.xworkz.ToString.internal;

public class Bird {
    private String name;
    private String type;
    private String spicies;

    public Bird(String name, String type, String spicies) {
        this.name = name;
        this.type = type;
        this.spicies=spicies;
    }

    public String toString() {
        return "name: " + name + ", type: " + type + ", spicies: " + spicies;
    }
    @Override
    public int hashCode() {
        return 110;
    }
}

