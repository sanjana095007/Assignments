package com.xworkz.referenceandvariable;

public class Company {

        String companyName;
        String location;
        int employeeCount;
    Education edu1 = new Education("BE - CSE", "IIT Delhi", 2018);
    Education edu2 = new Education("MBA", "Harvard University", 2021);
    Education edu3 = new Education("Ph.D.", "Stanford University", 2025);
    Education [] edu4 ={edu1,edu2,edu3};
        Company(String companyName, String location, int employeeCount) {
            this.companyName = companyName;
            this.location = location;
            this.employeeCount = employeeCount;
        }

        void display() {
            System.out.println("Company Name: " + companyName);
            System.out.println("Location: " + location);
            System.out.println("Employee Count: " + employeeCount);
            for(Education education:edu4){
                System.out.println("Degree: " + education.degree);
                System.out.println("Institution: " + education.institution);
                System.out.println("Year of Completion: " + education.yearOfCompletion);
                education.display();
            }
        }
    }


