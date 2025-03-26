package com.xworkz.referenceandvariable;

class PrimeMinister {
    String name;
    int age;
    int years;
    PrimeMinister(String name, int age, int years) {
        this.name = name;
        this.age = age;
        this.years = years;
    }
    Minister minister1 = new Minister("Amit Shah", 59, "Home Minister");
    Minister minister2 = new Minister("Nirmala Sitharaman", 64, "Finance Minister");
    Minister minister3 = new Minister("Rajnath Singh", 72, "Defense Minister");
    Minister[] minister4 = {minister1, minister2, minister3};
//    PersonalAssistant pesonalassistant1 = new PersonalAssistant("Raj", 45, 8741852369L);
     void display() {
         System.out.println("PrimeMinister Details :---");
        System.out.println("The PrimeMinister name is : " + this.name);
        System.out.println("The PrimeMinister age is : " + this.age);
        System.out.println("The PrimeMinister Years is :" + this.years);

        for (Minister minister : minister4) {
            //System.out.println("The Minister name is : " + minister.name);
            //System.out.println("The Minister age is : " + minister.age);
            //System.out.println("The Minister is : " + minister.ministry);
            minister.display();

        }
//         pesonalassistant1.display();
    }
}
