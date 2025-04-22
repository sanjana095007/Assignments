package com.xworkz.late.external;

import com.xworkz.late.internal.Internet;

public class InternetImp implements Internet {
    @Override
    public void connect() {
        System.out.println("running the connect method from Internet");
    }
}
