package com.xworkz.ToString.internal;

public class Camera {
    private String brand;
    private int megapixels;
    private double price;

    public Camera(String brand, int megapixels, double price) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand :"+brand+" "+ "megapixels :"+megapixels+" "+"price :"+price;
    }
    @Override
    public int hashCode() {
        return 113;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Camera) {
                System.out.println("Reference of Camera will be compared");
                Camera camera = this;
                Camera camera1 = (Camera) obj;
                if (camera.brand.equals(camera1.brand) && camera.megapixels == camera1.megapixels && camera.price == camera1.price) {
                    System.out.println("Both cameras are same");
                    return true;
                }
            }
        }
        return false;
    }

}

