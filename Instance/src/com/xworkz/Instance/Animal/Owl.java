package com.xworkz.Instance.Animal;

public class Owl extends Animal {
    public void hoot() {
        super.play();
        super.drink();
        super.run();
        super.scratch();
        super.sleep();
        System.out.println("Owl is hooting in the night.");
    }
}
