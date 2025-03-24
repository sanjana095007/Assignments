package com.xworkz;

import com.xworkz.Anotherpackage.*;
import com.xworkz.access.*;

public class Runner {
    public static void main(String[] args) {
        Finance finance=new Finance();
        CustomerBanking customerbanking=new CustomerBanking();
        finance.display();
        System.out.println("===========================================================================");
        Vehicles vehicles=new Vehicles();
        CarShowroom carshowroom =new CarShowroom();
        vehicles.display();
        System.out.println("===========================================================================");
        Staff staff=new Staff();
        TCS tcs=new TCS();
        staff.display();
        System.out.println("===========================================================================");
        Details details=new Details();
        Shoes shoes=new Shoes();
        details.display();
        System.out.println("===========================================================================");
        PVR pvr=new PVR();
        Entertainment entertainment=new Entertainment();
        pvr.display();
    }
}
