package com.xworkz.Abstract.internal;

public abstract class ShoeModel {
    String brand;
    int cost;
    String color;
    String type;

    ShoeModel(){
        this.brand=brand;
    }
    ShoeModel(String brand,int cost){
        this.brand=brand;
        this.cost=cost;
    }
    ShoeModel(String brand,int cost,String color,String type){
        this.brand=brand;
        this.cost=cost;
        this.color=color;
        this.type=type;
    }
    abstract void displayshoes();


}
