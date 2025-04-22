package com.xworkz.late.external;

import com.xworkz.late.internal.Firewall;

public class FirewallImp implements Firewall {
    @Override
    public void filterTraffic() {
        System.out.println("running the filterTraffic method from Firewall");
    }
}
