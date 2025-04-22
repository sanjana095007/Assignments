package com.xworkz.late.external;

import com.xworkz.late.internal.CloudStorage;

public class CloudStorageImp implements CloudStorage {
    @Override
    public void syncFiles() {
        System.out.println("running the syncFiles method from CloudStorage");
    }
}
