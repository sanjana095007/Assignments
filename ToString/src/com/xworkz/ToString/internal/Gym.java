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
    @Override
    public int hashCode() {
        return 143;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Gym) {
                System.out.println("Reference of Gym will be compared");
                Gym gym = this;
                Gym gym1 = (Gym) obj;
                if (gym.name.equals(gym1.name) && gym.gymtrainer.equals(gym1.gymtrainer) ) {
                    System.out.println("Both gyms are same");
                    return true;
                }
            }
        }
        return false;
    }

}

