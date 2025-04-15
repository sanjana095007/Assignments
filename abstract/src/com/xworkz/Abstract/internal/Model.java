package com.xworkz.Abstract.internal;

public class Model extends ShoeModel{
    public Model(String brand) {
        super();
    }
    public Model(String brand, int cost){
        super(brand, cost);
    }
    public Model(String brand,int cost,String color,String type){
        super(brand, cost, color, type);
    }
    @Override
    public void displayshoes() {
        System.out.println("display the model of shoes:cost : "+cost +" , "+" brand : "+brand+", "+" color : "+color+ " ,"+ "type : "+" "+type);
    }
}
