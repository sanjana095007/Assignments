package com.xworkz.Instance.Animal;

public class Leopard extends Cat{
    public void drinking(Cat cat){
        cat.Play();
        if(cat instanceof Leopard){
            System.out.println("is cat a Leopard");
            Leopard leopard=(Leopard) cat;
            leopard.hunt();
        }
    }
    public void hunt(){
        System.out.println("running the hunt method");
    }
}
