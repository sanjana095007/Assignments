package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.Door;
import com.xworkz.Interface.Internal.MobileApp;
import com.xworkz.Interface.Internal.SmartLock;

public class FingerScanner implements SmartLock, Door, MobileApp {

    @Override
    public void open() {
        System.out.println("running the open method in FingerprintScanner");
    }

    @Override
    public void close() {
        System.out.println("running the close method in FingerprintScanner");
    }

    @Override
    public void lock() {
        System.out.println("running the lock method in FingerprintScanner");
    }

    @Override
    public void breakin() {
        System.out.println("running the breakin method in FingerprintScanner");
    }

    @Override
    public void unlock() {
        System.out.println("running the unlock method in FingerprintScanner");
    }

    @Override
    public void openApp() {
        System.out.println("running the openApp method in FingerprintScanner");

    }

    @Override
    public void performAction() {
        System.out.println("running the performAction method in FingerprintScanner");

    }

    @Override
    public void closeApp() {
        System.out.println("running the closeApp method in FingerprintScanner");

    }
}
