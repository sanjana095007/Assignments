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
            //System.out.println("House Number: " + house.houseNumber);
            //System.out.println("Street Name: " + house.streetName);
           // System.out.println("Number of Rooms: " + house.numberOfRooms);
            house.display();
        }
    }

