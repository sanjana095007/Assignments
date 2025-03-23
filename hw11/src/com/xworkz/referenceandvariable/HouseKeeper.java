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
        transport.display();
    }
}
