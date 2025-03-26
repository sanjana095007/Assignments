package com.xworkz.referenceandvariable;

public class PersonalAssistant {
    String name;
    int age;
    Long phoneno;

    Portfolio portfolio1=new Portfolio("veeraiah",189452257L);
    Portfolio portfolio2=new Portfolio("sathish",65252257L);
    Portfolio portfolio3=new Portfolio("rajaya",5254257L);
    Portfolio [] portfolio4={portfolio1,portfolio2,portfolio3};

    PersonalAssistant(String name,int age,Long phoneno){
        this.name=name;
        this.age=age;
        this.phoneno=phoneno;
    }

    void display(){
        System.out.println("Personal assistant :--------");
        System.out.println("The pesonal assistant name is : " + this.name);
        System.out.println("The pesonal assistant age is : " + this.age);
        System.out.println("The pesonal assistant phone number is : " +this.phoneno);

        for(Portfolio portfolios:portfolio4){
            //System.out.println("The owner name is : " + portfolios.ownerName);
            //System.out.println("The total investment is : " + portfolios.totalInvestment);
            portfolios.display();

        }
    }


}
