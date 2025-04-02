package com.xworkz.Instance.Animal;

public class Fox extends Animal {
    public void sneak() {
        super.play();
        super.drink();
        super.run();
        super.scratch();
        super.sleep();
        System.out.println("Fox is sneaking around silently.");
    }
}
