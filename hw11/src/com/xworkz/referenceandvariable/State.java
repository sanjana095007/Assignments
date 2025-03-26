package com.xworkz.referenceandvariable;

public class State {
    String stateName;
    long population;
    String capitalCity;

    District district1=new District("Bangalore Urban",709.5, 13000000);
    District district2=new District("Mumbai Suburban", 446.0, 9300000);
    District district3=new District("Chennai", 426.0, 7100000);
    District [] district4={district1,district2,district3};
    State(String stateName,long population,String capitalCity){
        this.stateName=stateName;
        this.population=population;
        this.capitalCity=capitalCity;
    }
    void display(){
        System.out.println("the state name  is :"+this.stateName);
        System.out.println("the population of the state is :"+this.population);
        System.out.println("the capital City of the state is :"+this.capitalCity);
        for(District districts:district4){
            //System.out.println("the district name  is :"+districts.districtName);
            //System.out.println("the area of the district is :"+districts.area);
            //System.out.println("the population of the district is :"+districts.population);
            districts.display();
        }
    }
}
