package com.xworkz.Anotherpackage;

import com.xworkz.access.Banking;
import com.xworkz.access.Company;

public class TCS {
    Company company=new Company();
    void display(){
        company.companyname="TCS";
        company.setname();
        System.out.println("The name of the company is :"+company.companyname);;
    }
}
