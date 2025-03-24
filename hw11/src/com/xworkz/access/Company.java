package com.xworkz.access;

public class Company {
    public String companyname;
    int numberofemp;
    private int salary;

    public void setname() {
        System.out.println("Yhe name of company is :"+companyname);
        this.salary=30000;
    }

    void numberofemps() {
        System.out.println("number of employees in a company: " + numberofemp);
        System.out.println("the salary of each person :"+this.salary);
    }

    private void salarys() {
        System.out.println("the salary of each person :"+salary);
    }
}
