package com.xworkz.Instance.Animal;

public class Cat extends Animal {
    public void Play(){
        super.play();
        super.drink();
        super.run();
        super.scratch();
        super.sleep();
        System.out.println("running the play method in Cat");
    }
}
