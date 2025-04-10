package com.xworkz.ToString.internal;

public class Actor {
    private String name;
    private int age;
    private int filmCount;

    public Actor(String name, int age, int filmCount) {
        this.name = name;
        this.age = age;
        this.filmCount = filmCount;
    }

    @Override
    public String toString() {
        return "Actor name: " + name + ", Age: " + age + ", Films: " + filmCount;
    }
    @Override
    public int hashCode() {
        return 100;
    }
}

