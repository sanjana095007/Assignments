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
    @Override
    public int hashCode() {
        return 120;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Course) {
                System.out.println("Reference of Course will be compared");
                Course course = this;
                Course course1 = (Course) obj;
                if (course.name.equals(course1.name) && course.name.equals(course1.name) && course.credits == course1.credits) {
                    System.out.println("Both courses are same");
                    return true;
                }
            }
        }
        return false;
    }
}

