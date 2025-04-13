package com.xworkz.ToString.internal;

public class Tree {
    private String species;
    private int heightInFeet;
    private boolean isEvergreen;

    public Tree(String species, int heightInFeet, boolean isEvergreen) {
        this.species = species;
        this.heightInFeet = heightInFeet;
        this.isEvergreen = isEvergreen;
    }

    public String toString() {
        return "Tree: " + species + ", Height: " + heightInFeet + " Evergreen: " + isEvergreen;
    }
    @Override
    public int hashCode() {
        return 192;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Tree) {
                System.out.println("Reference of Tree will be compared");
                Tree tree = this;
                Tree tree1 = (Tree) obj;
                if (tree.species.equals(tree1.species)) {
                    System.out.println("Both trees are same");
                    return true;
                }
            }
        }
        return false;
    }


}
