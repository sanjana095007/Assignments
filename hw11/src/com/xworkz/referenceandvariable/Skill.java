package com.xworkz.referenceandvariable;

public class Skill {
        String skillName;
        String proficiencyLevel;
        int yearsOfExperience;
    Experience experience=new Experience("Corporate Events", 3, "Motivational Speaker");
        Skill(String skillName, String proficiencyLevel, int yearsOfExperience) {
            this.skillName = skillName;
            this.proficiencyLevel = proficiencyLevel;
            this.yearsOfExperience = yearsOfExperience;
        }

        void display() {
            System.out.println("Skill Name: " + this.skillName);
            System.out.println("Proficiency Level: " + this.proficiencyLevel);
            System.out.println("Years of Experience: " + this.yearsOfExperience);
            System.out.println("Company Name: " + experience.companyName);
            System.out.println("Years Worked: " + experience.yearsWorked);
            System.out.println("Role: " + experience.role);
            experience.display();
        }
    }

