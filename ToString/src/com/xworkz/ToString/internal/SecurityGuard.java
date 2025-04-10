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
}
