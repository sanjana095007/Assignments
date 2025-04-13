package com.xworkz.ToString.internal;

public class Professor {
    private String name;
    private String subject;
    private int publications;

    public Professor(String name, String subject, int publications) {
        this.name = name;
        this.subject = subject;
        this.publications = publications;
    }

    public String toString() {
        return "Professor: " + name + ", Subject: " + subject + ", Publications: " + publications;
    }
    @Override
    public int hashCode() {
        return 176;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Professor) {
                System.out.println("Reference of Professor will be compared");
                Professor professor = this;
                Professor professor1 = (Professor) obj;
                if (professor.name.equals(professor1.name)) {
                    System.out.println("Both professors are same");
                    return true;
                }
            }
        }
        return false;
    }

}
