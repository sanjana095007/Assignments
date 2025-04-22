package com.xworkz.late.external;

import com.xworkz.late.internal.Printer;

public class PrinterImp implements Printer {
    @Override
    public void printDocument() {
        System.out.println("running the printDocument method from Printer");
    }
}
