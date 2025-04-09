package com.xworkz.ToString.internal;

public class Gym {
    private String name;
    private String gymtrainer;
    private int clients;

    public Gym(String name, String gymtrainer, int clients) {
        this.name = name;
        this.gymtrainer = gymtrainer;
        this.clients = clients;
    }

    public String toString() {
        return "GymTrainer: " + name + ", trainer : " + gymtrainer + ", Clients: " + clients;
    }
}

