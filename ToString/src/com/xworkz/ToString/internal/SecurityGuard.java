package com.xworkz.ToString.internal;

public class SecurityGuard {
    private String name;
    private String company;
    private int shiftsCompleted;

    public SecurityGuard(String name, String company, int shiftsCompleted) {
        this.name = name;
        this.company = company;
        this.shiftsCompleted = shiftsCompleted;
    }

    public String toString() {
        return "Security Guard: " + name + ", Company: " + company + ", Shifts Completed: " + shiftsCompleted;
    }
    @Override
    public int hashCode() {
        return 179;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof SecurityGuard) {
                System.out.println("Reference of SecurityGuard will be compared");
                SecurityGuard s1 = this;
                SecurityGuard s2 = (SecurityGuard) obj;
                if (s1.name.equals(s2.name)) {
                    System.out.println("Both security guards are same");
                    return true;
                }
            }
        }
        return false;
    }

}
