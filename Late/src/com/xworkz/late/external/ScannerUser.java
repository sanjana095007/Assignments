package com.xworkz.late.external;

import com.xworkz.late.internal.Scanner;

public class ScannerUser {
    Scanner scanner;

    public ScannerUser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execute() {
        if (scanner != null) {
            System.out.println("checking null");
            scanner.scanImage();
        }
    }
}
