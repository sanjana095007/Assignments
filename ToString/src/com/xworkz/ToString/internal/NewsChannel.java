package com.xworkz.ToString.internal;

public class NewsChannel {
    private String name;
    private String language;
    private int rating;

    public NewsChannel(String name, String language, int rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    public String toString() {
        return "NewsChannel: " + name + ", Language: " + language + ", Rating: " + rating;
    }
    @Override
    public int hashCode() {
        return 163;
    }
}
