package com.xworkz.referenceandvariable;

public class Education {

        String degree;
        String institution;
        int yearOfCompletion;

        Education(String degree, String institution, int yearOfCompletion) {
            this.degree = degree;
            this.institution = institution;
            this.yearOfCompletion = yearOfCompletion;
        }

        void display() {
            System.out.println("Degree: " + degree);
            System.out.println("Institution: " + institution);
            System.out.println("Year of Completion: " + yearOfCompletion);
        }
    }

