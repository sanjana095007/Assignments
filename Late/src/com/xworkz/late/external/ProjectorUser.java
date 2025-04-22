package com.xworkz.late.external;

import com.xworkz.late.internal.Projector;

public class ProjectorUser {
    Projector projector;

    public ProjectorUser(Projector projector) {
        this.projector = projector;
    }

    public void execute() {
        if (projector != null) {
            System.out.println("checking null");
            projector.displayContent();
        }
    }
}
