package com.xworkz.ToString.internal;

public class Flight {
    private String airline;
    private int flightNumber;
    private String destination;

    public Flight(String airline, int flightNumber, String destination) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "airline: " + airline + ", flightNumber: " + flightNumber + ", destination: " + destination;
    }
    @Override
    public int hashCode() {
        return 136;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Flight) {
                System.out.println("Reference of Flight will be compared");
                Flight flight = this;
                Flight flight1 = (Flight) obj;
                if (flight.airline.equals(flight1.airline) && flight.flightNumber == flight1.flightNumber && flight.destination.equals(flight1.destination)) {
                    System.out.println("Both flights are same");
                    return true;
                }
            }
        }
        return false;
    }
}

