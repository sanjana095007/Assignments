package com.xworkz.referenceandvariable;

public class House {
    int houseNumber;
    String streetName;
    int numberOfRooms;
    Room room1 = new Room(101, "Bedroom", 20.5);
    Room room2 = new Room(102, "Kitchen", 15.0);
    Room room3 = new Room(103, "Living Room", 25.8);
    Room []room4={room1,room2,room3};
    House(int houseNumber, String streetName, int numberOfRooms) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.numberOfRooms = numberOfRooms;
    }

    void display() {
        System.out.println("House Number: " + houseNumber);
        System.out.println("Street Name: " + streetName);
        System.out.println("Number of Rooms: " + numberOfRooms);
        for(Room rooms:room4){
            System.out.println("Room Number: " + rooms.roomNumber);
            System.out.println("Room Type: " + rooms.roomType);
            System.out.println("Room Size: " +rooms.roomSize + " sq.m");
            rooms.display();
        }
    }

}
