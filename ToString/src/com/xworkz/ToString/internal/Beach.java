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
    @Override
    public int hashCode() {
        return 108;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Beach) {
                System.out.println("Reference of Beach will be compared");
                Beach beach = this;
                Beach beach1 = (Beach) obj;
                if (beach.name.equals(beach1.name) && beach.location.equals(beach1.location) && beach.state.equals(beach1.state)) {
                    System.out.println("Both beaches are same");
                    return true;
                }
            }
        }
        return false;
    }

}
