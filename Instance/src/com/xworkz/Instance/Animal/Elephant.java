package com.xworkz.Instance.Animal;

public class Elephant extends Animal {

    public void trumpet() {
        super.play();
        super.drink();
        super.run();
        super.scratch();
        super.sleep();
        System.out.println("Elephant is trumpeting!");
    }
}

