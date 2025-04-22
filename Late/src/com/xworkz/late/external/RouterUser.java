package com.xworkz.late.external;

import com.xworkz.late.internal.Router;

public class RouterUser {
    Router router;

    public RouterUser(Router router) {
        this.router = router;
    }

    public void execute() {
        if (router != null) {
            System.out.println("checking null");
            router.transmitSignal();
        }
    }
}
