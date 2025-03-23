package com.xworkz.referenceandvariable;

public class Portfolio {
    String ownerName;
    long totalInvestment;
     Details details=new Details("Market Analysis","Research", 102);
    Portfolio(String ownerName,long totalInvestment){
        this.ownerName=ownerName;
        this.totalInvestment=totalInvestment;
    }
    void display(){
        System.out.println("the owner name  is :"+this.ownerName);
        System.out.println("the total investment  :"+this.totalInvestment);
        details.display();
    }
}
