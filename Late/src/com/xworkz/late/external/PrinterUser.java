package com.xworkz.late.external;

import com.xworkz.late.internal.Printer;

public class PrinterUser {
    Printer printer;

    public PrinterUser(Printer printer) {
        this.printer = printer;
    }

    public void execute() {
        if (printer != null) {
            System.out.println("checking null");
            printer.printDocument();
        }
    }
}
