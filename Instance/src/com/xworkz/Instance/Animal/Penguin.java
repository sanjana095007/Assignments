package com.xworkz.Instance.Animal;

public class Penguin extends Animal {
    public void waddle() {
        super.play();
        super.drink();
        super.run();
        super.scratch();
        super.sleep();
        System.out.println("Penguin is waddling on the ice.");
    }
}
