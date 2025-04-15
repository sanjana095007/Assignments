package com.xworkz.Abstract.internal;

public abstract class Details {
    int cost;
    String brand;
    int size;

    Details(int cost,String brand,int size){
        this.cost=cost;
        this.brand=brand;
        this.size=size;
    }
    abstract void display();
}
