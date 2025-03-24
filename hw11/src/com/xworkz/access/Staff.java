package com.xworkz.access;

public class Staff {
    Company company=new Company();
    public void display(){
        company.companyname="TCS";
        company.numberofemp=100;;

        System.out.println("the name of the company is :"+company.companyname);
        System.out.println("The number of employees : " + company.numberofemp);
        company.setname();
        company.numberofemps();
    }
}
