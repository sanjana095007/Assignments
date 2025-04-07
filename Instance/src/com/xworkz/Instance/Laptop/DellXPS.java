package com.xworkz.Instance.Laptop;

public class DellXPS extends Dell {
    public void launchProductivitySuite(Dell dell){
        dell.sleep();
        if(dell instanceof DellXPS){
            System.out.println("Is laptop an instance of DellXPS13?");
            DellXPS xps = (DellXPS) dell;
            xps.Display();
        }
    }

    public void Display(){
        System.out.println("running display");
    }
}
