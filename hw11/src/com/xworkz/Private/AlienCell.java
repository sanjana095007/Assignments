package com.xworkz.Private;

public class AlienCell {
        public void displayAlien(Alien[] alien) {
            for(Alien alines : alien){
                if(alines != null){
                    System.out.println("Seen By: " + alines.getSeenBy());
                    System.out.println("Seen Date: " + alines.getSeenDate());
                    System.out.println("Description: " + alines.getDescribe());
                }
            }

        }

        public void values() {
            Alien[] alien = new Alien[2];
            alien[0]=new Alien();
            alien[0].setSeenBy("Astronomer");
            alien[0].setSeenDate("2025-03-25");
            alien[0].setDescribe("Tall and thin");

            alien[1] = new Alien();
            alien[1].setSeenBy("swathi");
            alien[1].setSeenDate("2024-09-13");
            alien[1].setDescribe("tall and large head and thin");

            displayAlien(alien);
        }
    }

