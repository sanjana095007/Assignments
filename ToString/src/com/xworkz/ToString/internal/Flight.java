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
}

