package com.xworkz.Interface.Internal;

public class CityMuseum implements Museum {
    @Override
    public void displayExhibits() {
        System.out.println("running the displayExhibits method");
    }

    @Override
    public void guideVisitors() {
        System.out.println("running the guideVisitors method");
    }

    @Override
    public void maintainArtifacts() {
        System.out.println("running the maintainArtifacts method");
    }
    @Override
    public void Open() {
        System.out.println("running the Open method");

    }
}
