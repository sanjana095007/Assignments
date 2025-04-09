package com.xworkz.ToString.internal;

public class Engineer {
   private String name;
   private String field;
   private int projectsCompleted;

    public Engineer(String name, String field, int projectsCompleted) {
        this.name = name;
        this.field = field;
        this.projectsCompleted = projectsCompleted;
    }

    public String toString() {
        return "Engineer: " + name + ", Field: " + field + ", Projects Completed: " + projectsCompleted;
    }
}
