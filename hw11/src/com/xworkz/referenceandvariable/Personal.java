package com.xworkz.referenceandvariable;

public class Personal {
        String name;
        String designation;
        double salary;
    Skill skill=new Skill("Public Speaking", "Intermediate", 3);
    Personal(String name, String designation, double salary) {
            this.name = name;
            this.designation = designation;
            this.salary = salary;
        }

        void display() {
            System.out.println("Personnel Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Salary: ₹" + salary);
            System.out.println("Skill Name: " + skill.skillName);
            System.out.println("Proficiency Level: " + skill.proficiencyLevel);
            System.out.println("Years of Experience: " + skill.yearsOfExperience);
            skill.display();
        }
    }


