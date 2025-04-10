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
}
