package com.xworkz.ToString.internal;

public class IceCream {
    private String name;
    private String location;
    private int flavors;

    public IceCream(String name, String location, int flavors) {
        this.name = name;
        this.location = location;
        this.flavors = flavors;
    }

    public String toString() {
        return "IceCream: " + name + ", Location: " + location + ", Flavors: " + flavors;
    }
    @Override
    public int hashCode() {
        return 147;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof IceCream) {
                System.out.println("Reference of IceCream will be compared");
                IceCream iceCream = this;
                IceCream iceCream1 = (IceCream) obj;
                if (iceCream.name.equals(iceCream1.name) && iceCream.location.equals(iceCream1.location)) {
                    System.out.println("Both ice creams are same");
                    return true;
                }
            }
        }
        return false;
    }


}
