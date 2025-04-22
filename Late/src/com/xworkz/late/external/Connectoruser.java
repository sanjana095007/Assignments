package com.xworkz.late.external;

import com.xworkz.late.internal.Connector;

public class Connectoruser {

    Connector connector;

    public  Connectoruser(Connector connector){
        this.connector=connector;
    }
    public  void  extecute(){
        if(connector != null){
            System.out.println("checking null");
            connector.run();
        }

    }
}
