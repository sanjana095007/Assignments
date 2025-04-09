package com.xworkz.ToString.internal;

public class Beach {
    private String name;
    private String location;
    private  String state;

    public Beach(String name,String location,String state){
        this.name=name;
        this.location=location;
        this.state=state;
    }
    public String tostring(){
        return "name :"+name+" "+"location :"+location+" "+"state :"+state;
    }
}
