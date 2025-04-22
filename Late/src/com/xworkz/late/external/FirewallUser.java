package com.xworkz.late.external;

import com.xworkz.late.internal.Firewall;

public class FirewallUser {
    Firewall firewall;

    public FirewallUser(Firewall firewall) {
        this.firewall = firewall;
    }

    public void execute() {
        if (firewall != null) {
            System.out.println("checking null");
            firewall.filterTraffic();
        }
    }
}
