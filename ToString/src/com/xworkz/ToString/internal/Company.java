package com.xworkz.ToString.internal;

public class Company {
    private String name;
    private int noofemp;
    private  int salary;

    public Company(String name,int noofemp,int salary){
        this.name=name;
        this.noofemp=noofemp;
        this.salary=salary;
    }
    public String tostring(){
        return "name :"+name+" "+"noofemp :"+noofemp+" "+"salary :"+salary;
    }
}
