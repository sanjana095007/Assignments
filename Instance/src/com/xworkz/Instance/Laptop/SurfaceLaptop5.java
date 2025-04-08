package com.xworkz.Instance.Laptop;

public class SurfaceLaptop5 extends Microsoft {
    public void launchDesignApp(Microsoft microsoft){
        microsoft.features();
        if(microsoft instanceof SurfaceLaptop5){
            System.out.println("Is microsoft an instance of SurfaceLaptop5");
            SurfaceLaptop5 surface = (SurfaceLaptop5) microsoft;
            surface.ScreenTouch();
        }
    }

    public void ScreenTouch(){
        System.out.println("running Screen Touch");
    }
}
