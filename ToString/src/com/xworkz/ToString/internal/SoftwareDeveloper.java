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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof SoftwareDeveloper) {
                System.out.println("Reference of SoftwareDeveloper will be compared");
                SoftwareDeveloper developer = this;
                SoftwareDeveloper developer1 = (SoftwareDeveloper) obj;
                if (developer.name.equals(developer1.name)) {
                    System.out.println("Both software developers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

