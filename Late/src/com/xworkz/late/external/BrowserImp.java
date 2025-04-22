package com.xworkz.late.external;

import com.xworkz.late.internal.Browser;

public class BrowserImp implements Browser {
    @Override
    public void openWebsite() {
        System.out.println("running the openWebsite method from Browser");
    }
}
