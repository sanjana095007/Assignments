package com.xworkz.ToString.internal;

public class Police {
    private String name;
    private String department;
    private int casesSolved;

    public Police(String name, String department, int casesSolved) {
        this.name = name;
        this.department = department;
        this.casesSolved = casesSolved;
    }

    public String toString() {
        return "Police Officer: " + name + ", Department: " + department + ", Cases Solved: " + casesSolved;
    }
    @Override
    public int hashCode() {
        return 173;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Police) {
                System.out.println("Reference of Police will be compared");
                Police police = this;
                Police police1 = (Police) obj;
                if (police.name.equals(police1.name)) {
                    System.out.println("Both police officers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
