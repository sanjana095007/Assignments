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
}
