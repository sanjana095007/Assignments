package com.xworkz.Instance.Airport;

public class InternationalFlights extends ShivajiMaharaj {
    public void Arrival(ShivajiMaharaj shivajiMaharaj){
        shivajiMaharaj.land();
        if(shivajiMaharaj instanceof InternationalFlights){
            System.out.println("is airport an InternationalFlights instance");
            InternationalFlights flight = (InternationalFlights) shivajiMaharaj;
            flight.verifyPassport();
        }
    }

    public void verifyPassport(){
        System.out.println("running verify passport");
    }
}

