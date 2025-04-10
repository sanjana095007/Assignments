package com.xworkz.ToString.internal;

public class SoftwareDeveloper {
    private String name;
    private String language;
    private int appsDeveloped;

    public SoftwareDeveloper(String name, String language, int appsDeveloped) {
        this.name = name;
        this.language = language;
        this.appsDeveloped = appsDeveloped;
    }

    public String toString() {
        return "Developer: " + name + ", Language: " + language + ", Apps: " + appsDeveloped;
    }@Override
    public int hashCode() {
        return 181;
    }
}

