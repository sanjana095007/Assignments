package com.xworkz.late.external;

import com.xworkz.late.internal.Browser;

public class BrowserUser {
    Browser browser;

    public BrowserUser(Browser browser) {
        this.browser = browser;
    }

    public void execute() {
        if (browser != null) {
            System.out.println("checking null");
            browser.openWebsite();
        }
    }
}
