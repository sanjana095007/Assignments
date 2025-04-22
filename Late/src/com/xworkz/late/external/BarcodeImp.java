package com.xworkz.late.external;
import com.xworkz.late.internal.BarcodeScanner;

public class BarcodeImp implements BarcodeScanner {

    @Override
    public void scanBarcode() {
        System.out.println("running the scanbarcode method");
    }
}
