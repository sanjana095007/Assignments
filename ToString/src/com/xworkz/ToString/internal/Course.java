package com.xworkz.ToString.internal;

public class Course {
    private String course;
    private String name;
    private int credits;

    public Course(String course, String name, int credits) {
        this.course = course;
        this.name = name;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course:"+course+" "+"name :"+name+" "+ "credits:"+credits;
    }
}

