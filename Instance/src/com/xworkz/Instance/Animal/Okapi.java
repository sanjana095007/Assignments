package com.xworkz.Instance.Animal;

public class Okapi extends Giraffe {
    public void exploreForest(Giraffe giraffe){
        giraffe.eatLeaves();
        if(giraffe instanceof Okapi){
            System.out.println("is giraffe an Okapi");
            Okapi okapi = (Okapi) giraffe;
            okapi.nibblePlants();
        }
    }

    public void nibblePlants(){
        System.out.println("running the nibblePlants method");
    }
}

