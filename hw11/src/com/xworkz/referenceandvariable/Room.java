package com.xworkz.referenceandvariable;

public class Room {
    int roomNumber;
    String roomType;
    double roomSize;
    HouseKeeper houseKeeper1 = new HouseKeeper("Rajesh", 45, 15);
    HouseKeeper houseKeeper2 = new HouseKeeper("Sita", 38, 10);
    HouseKeeper houseKeeper3 = new HouseKeeper("Amit", 50, 20);
    HouseKeeper[] houseKeeper4={houseKeeper1,houseKeeper2,houseKeeper3};
    Room(int roomNumber, String roomType, double roomSize) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomSize = roomSize;
    }

    void display() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Size: " + roomSize + " sq.m");
        for(HouseKeeper houseskeeper:houseKeeper4)
        {
            System.out.println("Housekeeper Name: " + houseskeeper.name);
            System.out.println("Age: " + houseskeeper.age);
            System.out.println("Years of Experience: " + houseskeeper.experience);
            houseskeeper.display();
        }
    }
}
