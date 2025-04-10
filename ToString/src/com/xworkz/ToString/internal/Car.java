package com.xworkz.ToString.internal;

public class Car {
    private String color;
    private int price;
    private String brand;

    public Car(String color,int price,String brand){
        this.color=color;
        this.price=price;
        this.brand=brand;
    }
    @Override
    public String toString(){
        return "color :"+color+" "+ "price :"+price+" "+"brand :"+brand;
    }
    @Override
    public int hashCode() {
        return 114;
    }
}
