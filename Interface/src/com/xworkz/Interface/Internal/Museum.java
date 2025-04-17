package com.xworkz.Interface.Internal;

public interface Museum {
    public abstract void displayExhibits();
    public abstract void guideVisitors();
    public abstract void maintainArtifacts();
    default void Open() {
        System.out.println("Running the open method");
    }
}
