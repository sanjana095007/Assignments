package com.xworkz.Instance.Laptop;

public class SurfaceLaptop5 extends Microsoft {
    public void launchDesignApp(Microsoft microsoft){
        microsoft.features();
        if(microsoft instanceof SurfaceLaptop5){
            System.out.println("Is laptop an instance of SurfaceLaptop5?");
            SurfaceLaptop5 surface = (SurfaceLaptop5) microsoft;
            surface.enableTouchAndInk();
        }
    }

    public void enableTouchAndInk(){
        System.out.println("Touch and Surface Pen input enabled on Surface Laptop 5.");
    }
}
