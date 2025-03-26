package com.xworkz.referenceandvariable;

public class District {
    String districtName;
    double area;
    long population;

    City city1 = new City("Bangalore", 12000000, 560001);
    City city2 = new City("Mumbai", 20000000, 400001);
    City city3 = new City("Chennai", 8000000, 600001);
    City []city4={city1,city2,city3};
    District(String districtName,double area,long population){
        this.districtName=districtName;
        this.area=area;
        this.population=population;
    }
    void display(){
        System.out.println("the district name  is :"+this.districtName);
        System.out.println("the area of the district is :"+this.area);
        System.out.println("the population of the district is :"+this.population);
        for(City cities:city4){
            //System.out.println("City Name: " + cities.cityName);
           // System.out.println("Population: " + cities.population);
           // System.out.println("Pincode: " + cities.pincode);
            cities.display();
        }
    }
}
