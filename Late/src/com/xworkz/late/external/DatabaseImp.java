package com.xworkz.late.external;

import com.xworkz.late.internal.Database;

public class DatabaseImp implements Database {
    @Override
    public void storeData() {
        System.out.println("running the storeData method from Database");
    }
}
