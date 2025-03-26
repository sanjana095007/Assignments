package com.xworkz.referenceandvariable;

public class Experience {
        String companyName;
        int yearsWorked;
        String role;
    ExperienceDetails experience1 = new ExperienceDetails("TEDx", 2, "Delivered inspiring talks on leadership.");
    ExperienceDetails experience2 = new ExperienceDetails("Google", 5, "Led a team in AI research and development.");
    ExperienceDetails experience3 = new ExperienceDetails("Harvard University", 3, "Conducted workshops on public speaking and communication.");
    ExperienceDetails [] experience4 ={experience1,experience2,experience3};
        Experience(String companyName, int yearsWorked, String role) {
            this.companyName = companyName;
            this.yearsWorked = yearsWorked;
            this.role = role;
        }

        void display() {
            System.out.println("Company Name: " + companyName);
            System.out.println("Years Worked: " + yearsWorked);
            System.out.println("Role: " + role);
            for(ExperienceDetails experienceDetails:experience4){
                System.out.println("Organization Name: " + experienceDetails.organizationName);
                System.out.println("Duration: " + experienceDetails.duration + " years");
                System.out.println("Key Achievements: " + experienceDetails.keyAchievements);
                experienceDetails.display();
            }
        }
    }
