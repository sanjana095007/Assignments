package com.xworkz.Private;

public class AlienCell {
        public void displayAlien(Alien alien) {
            System.out.println("Seen By: " + alien.getSeenBy());
            System.out.println("Seen Date: " + alien.getSeenDate());
            System.out.println("Description: " + alien.getDescribe());
        }

        public void values() {
            Alien alien = new Alien();
            alien.setSeenBy("Astronomer");
            alien.setSeenDate("2025-03-25");
            alien.setDescribe("Tall and thin");
            displayAlien(alien);
        }
    }

