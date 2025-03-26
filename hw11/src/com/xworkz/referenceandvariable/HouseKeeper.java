package com.xworkz.referenceandvariable;

public class HouseKeeper {
    String name;
    int age;
    int experience;
Transport transport=new Transport("car",4,90);
    HouseKeeper(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    void display() {
        System.out.println("Housekeeper Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Years of Experience: " + experience);
        System.out.println("Transport Mode: " + transport.mode);
        System.out.println("Capacity: " + transport.capacity);
        System.out.println("Speed: " + transport.speed + " km/h");
        transport.display();
    }
}
