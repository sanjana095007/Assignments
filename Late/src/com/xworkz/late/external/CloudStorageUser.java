package com.xworkz.late.external;

import com.xworkz.late.internal.CloudStorage;

public class CloudStorageUser {
    CloudStorage cloudStorage;

    public CloudStorageUser(CloudStorage cloudStorage) {
        this.cloudStorage = cloudStorage;
    }

    public void execute() {
        if (cloudStorage != null) {
            System.out.println("checking null");
            cloudStorage.syncFiles();
        }
    }
}
