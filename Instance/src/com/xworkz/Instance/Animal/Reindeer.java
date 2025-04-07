package com.xworkz.Instance.Animal;

public class Reindeer extends Deer{
    public void walk(Deer deer){
        deer.lookAround();
        if(deer instanceof Reindeer){
            System.out.println("is deer a Reindeer");
            Reindeer reindeer=(Reindeer) deer;
            reindeer.drinking();
        }
    }
    public void drinking(){
        System.out.println("running the drinking method");
    }
}
