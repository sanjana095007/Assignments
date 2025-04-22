package com.xworkz.late.external;

import com.xworkz.late.internal.Database;

public class DatabaseUser {
    Database database;

    public DatabaseUser(Database database) {
        this.database = database;
    }

    public void execute() {
        if (database != null) {
            System.out.println("checking null");
            database.storeData();
        }
    }
}
