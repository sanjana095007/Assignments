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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof NewsChannel) {
                System.out.println("Reference of NewsChannel will be compared");
                NewsChannel newsChannel = this;
                NewsChannel newsChannel1 = (NewsChannel) obj;
                if (newsChannel.name.equals(newsChannel1.name) && newsChannel1.language.equals(newsChannel1.language)) {
                    System.out.println("Both news channels are same");
                    return true;
                }
            }
        }
        return false;
    }

}
