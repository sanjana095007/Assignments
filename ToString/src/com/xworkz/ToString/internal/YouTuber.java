package com.xworkz.ToString.internal;

public class YouTuber {
    private String channelName;
    private String category;
    private int subscribers;

    public YouTuber(String channelName, String category, int subscribers) {
        this.channelName = channelName;
        this.category = category;
        this.subscribers = subscribers;
    }

    public String toString() {
        return "YouTuber: " + channelName + ", Category: " + category + ", Subscribers: " + subscribers;
    }
    @Override
    public int hashCode() {
        return 197;
    }
}

