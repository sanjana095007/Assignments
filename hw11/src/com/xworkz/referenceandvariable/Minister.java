package com.xworkz.referenceandvariable;

public class Minister {
    String name;
    int age;
    String ministry;
    PersonalAssistant pesonalassistant1 = new PersonalAssistant("Raj", 45, 8741852369L);


    Minister(String name, int age, String ministry) {
        this.name = name;
        this.age = age;
        this.ministry = ministry;
    }

    void display() {
        System.out.println("Minister Details :-----------");
        System.out.println("the name of the minister is :" + this.name);
        System.out.println("the age of the minister is :" + this.age);
        System.out.println("the type of the minister is :" + this.ministry);
        pesonalassistant1.display();

    }

}

