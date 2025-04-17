package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.MobileApp;
import com.xworkz.Interface.Internal.Speaker;

public class VirtualAssistant implements Speaker, MobileApp {
    @Override
    public void playSound() {
        System.out.println("running the playSound method in VirtualAssistant ");
    }

    @Override
    public void increaseVolume() {
        System.out.println("running the increaseVolume method in VirtualAssistant ");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("running the decreaseVolume method in VirtualAssistant ");
    }

    @Override
    public void openApp() {
        System.out.println("running the openApp method in VirtualAssistant ");
    }

    @Override
    public void performAction() {
        System.out.println("running the performAction method in VirtualAssistant ");
    }

    @Override
    public void closeApp() {
        System.out.println("running the closeApp method in VirtualAssistant ");
    }
}
