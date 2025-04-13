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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof YouTuber) {
                System.out.println("Reference of YouTuber will be compared");
                YouTuber youTuber = this;
                YouTuber youTuber1 = (YouTuber) obj;
                if (youTuber.channelName.equals(youTuber1.channelName) ) {
                    System.out.println("Both YouTubers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

