package com.xworkz.referenceandvariable;

public class City {
        String cityName;
        long population;
        int pincode;
    Ward ward1 = new Ward(101, "MG Road", 15000);
    Ward ward2 = new Ward(102, "Indiranagar", 20000);
    Ward ward3 = new Ward(103, "Koramangala", 25000);
    Ward [] ward4={ward1,ward2,ward3};
        City(String cityName, long population, int pincode) {
            this.cityName = cityName;
            this.population = population;
            this.pincode = pincode;
        }

        void display() {
            System.out.println("City Name: " + this.cityName);
            System.out.println("Population: " + this.population);
            System.out.println("Pincode: " + this.pincode);
            for(Ward wards:ward4){
                //System.out.println("Ward Number: " + wards.wardNumber);
               // System.out.println("Area Name: " + wards.areaName);
               // System.out.println("Population: " + wards.population);
                wards.display();
            }
        }
    }

