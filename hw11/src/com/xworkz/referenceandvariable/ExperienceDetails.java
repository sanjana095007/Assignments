package com.xworkz.referenceandvariable;

public class ExperienceDetails {

        String organizationName;
        int duration; // Duration in years or months
        String keyAchievements;
    Company company = new Company("Google", "California, USA", 150000);
        ExperienceDetails(String organizationName, int duration, String keyAchievements) {
            this.organizationName = organizationName;
            this.duration = duration;
            this.keyAchievements = keyAchievements;
        }

        void display() {
            System.out.println("Organization Name: " + organizationName);
            System.out.println("Duration: " + duration + " years");
            System.out.println("Key Achievements: " + keyAchievements);
            company.display();
        }
    }


