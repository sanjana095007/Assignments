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
}
