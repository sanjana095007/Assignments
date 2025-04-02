package com.xworkz.Instance.Animal;

public class Snake extends Animal {
    public void slither() {
        super.play();
        super.drink();
        super.run();
        super.scratch();
        super.sleep();
        System.out.println("Snake is slithering through the grass.");
    }
}