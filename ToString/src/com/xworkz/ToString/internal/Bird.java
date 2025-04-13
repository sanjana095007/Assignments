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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Bird) {
                System.out.println("Reference of Bird will be compared");
                Bird bird = this;
                Bird bird1 = (Bird) obj;
                if (bird.name.equals(bird1.name) && bird.type.equals(bird1.type) && bird.spicies.equals(bird1.spicies)) {
                    System.out.println("Both birds are same");
                    return true;
                }
            }
        }
        return false;
    }

}

