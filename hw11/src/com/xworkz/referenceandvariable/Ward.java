package com.xworkz.referenceandvariable;

public class Ward {

        int wardNumber;
        String areaName;
        long population;
        House house=new House(256,"mahaveera nagar",5);
        Ward(int wardNumber, String areaName, long population) {
            this.wardNumber = wardNumber;
            this.areaName = areaName;
            this.population = population;
        }

        void display() {
            System.out.println("Ward Number: " + this.wardNumber);
            System.out.println("Area Name: " + this.areaName);
            System.out.println("Population: " + this.population);
            house.display();
        }
    }

