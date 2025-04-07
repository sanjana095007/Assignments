package com.xworkz.Instance.Animal;

public class Alligators extends Crocodile{
    public void swims(Crocodile crocodile){
        crocodile.drink();
        if(crocodile instanceof Alligators){
            System.out.println("is crocodile a Alligators");
            Alligators alligators=(Alligators) crocodile;
            alligators.Breath();
        }
    }
    public void Breath(){
        System.out.println("running the Breath method");
    }
}
