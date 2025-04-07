package com.xworkz.Instance.Animal;

public class Jaguar extends Tiger{
    public void hunt(Tiger tiger){
        tiger.scratch();
        if(tiger instanceof Jaguar){
            System.out.println("is tiger a Jaguar");
            Jaguar jaguar=(Jaguar) tiger;
            jaguar.eating();
        }
    }
    public void eating(){
        System.out.println("running the eating method");
    }
}
