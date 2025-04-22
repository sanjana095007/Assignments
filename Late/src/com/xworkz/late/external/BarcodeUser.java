package com.xworkz.late.external;
import com.xworkz.late.internal.BarcodeScanner;

public class BarcodeUser {
    BarcodeScanner barcode;

    public BarcodeUser(BarcodeScanner barcode) {
        this.barcode = barcode;
    }

    public void execute() {
        if (barcode != null) {
            System.out.println("checking null");
            barcode.scanBarcode();
        }
    }
}
