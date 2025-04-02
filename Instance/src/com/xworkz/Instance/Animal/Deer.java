package com.xworkz.Instance.Animal;

public class Deer extends Animal{

    public void lookAround() {
        super.play();
        super.drink();
        super.run();
        super.scratch();
        super.sleep();
        System.out.println("Deer is looking around cautiously.");
    }
}

