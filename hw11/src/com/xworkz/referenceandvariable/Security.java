package com.xworkz.referenceandvariable;

public class Security {
    String securityLevel;
    int numberOfGuards;
    Personal personal1 = new Personal("Rajesh Kumar", "Manager", 75000);
    Personal personal2 = new Personal("Sita Verma", "Technician", 50000);
    Personal personal3 = new Personal("Amit Singh", "Security Officer", 40000);
    Personal [] personal4={personal1,personal2,personal3};
    Security(String securityLevel,int numberOfGuards){
        this.securityLevel=securityLevel;
        this.numberOfGuards=numberOfGuards;
    }
    void display(){
        System.out.println("the security level  is :"+this.securityLevel);
        System.out.println("the number of guards :"+this.numberOfGuards);
        for(Personal personals:personal4){
            personals.display();
        }
    }

}
