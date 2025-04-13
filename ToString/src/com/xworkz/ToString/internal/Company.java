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
    @Override
    public int hashCode() {
        return 119;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Company) {
                System.out.println("Reference of Company will be compared");
                Company company = this;
                Company company1 = (Company) obj;
                if (company.name.equals(company1.name) && company.noofemp == company1.noofemp && company.salary == company1.salary) {
                    System.out.println("Both companies are same");
                    return true;
                }
            }
        }
        return false;
    }

}
