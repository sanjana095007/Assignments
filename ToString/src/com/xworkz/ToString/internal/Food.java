package com.xworkz.ToString.internal;

public class Food {
    private String name;
    private String category;
    private double price;

    public Food(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name :"+name+" "+ "category :"+category+" "+"price :"+price;
    }
    @Override
    public int hashCode() {
        return 138;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Food) {
                System.out.println("Reference of Food will be compared");
                Food food = this;
                Food food1 = (Food) obj;
                if (food.name.equals(food1.name) && food.category.equals(food1.category) && food.price == food1.price) {
                    System.out.println("Both foods are same");
                    return true;
                }
            }
        }
        return false;
    }

}

