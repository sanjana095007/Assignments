package com.xworkz.ToString.internal;

public class Event {
    private String Eventname;
    private String location;
    private String date;

    public Event(String Eventname, String location, String date) {
        this.Eventname = Eventname;
        this.location = location;
        this.date = date;
    }

    public String toString() {
        return "Event: " + Eventname + ", Location: " + location + ", Date: " + date;
    }
    @Override
    public int hashCode() {
        return 130;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Event) {
                System.out.println("Reference of Event will be compared");
                Event event = this;
                Event event1 = (Event) obj;
                if (event.Eventname.equals(event1.Eventname) && event.location.equals(event1.location) && event.date.equals(event1.date)) {
                    System.out.println("Both events are same");
                    return true;
                }
            }
        }
        return false;
    }

}
