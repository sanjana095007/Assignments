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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Car) {
                System.out.println("Reference of Car will be compared");
                Car car = this;
                Car car1 = (Car) obj;
                if (car.color.equals(car1.color) && car.price == car1.price && car.brand.equals(car1.brand)) {
                    System.out.println("Both cars are same");
                    return true;
                }
            }
        }
        return false;
    }

}
